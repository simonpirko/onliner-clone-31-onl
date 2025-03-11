package by.tms.onlinerclone31onl.controller;

import by.tms.onlinerclone31onl.dao.AccountDAO;
import by.tms.onlinerclone31onl.dao.UserDAO;
import by.tms.onlinerclone31onl.domain.Account;
import by.tms.onlinerclone31onl.domain.dto.UserDTO;
import by.tms.onlinerclone31onl.domain.dto.UserLoginDTO;
import by.tms.onlinerclone31onl.domain.dto.UserRegistrationDTO;
import by.tms.onlinerclone31onl.services.AccountService;
import by.tms.onlinerclone31onl.services.UserService;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AccountController {

    @Autowired
    AccountService accountService;
    @Autowired
    private AccountDAO accountDAO;
    @Autowired
    HttpSession session;
    @Autowired
    private UserService userService;
    @Autowired
    private UserDAO userDAO;

    @GetMapping("/registration")
    public String registration(@ModelAttribute("userRegistrationDTO") UserRegistrationDTO userRegistrationDTO) {
        return "registration";
    }

    @PostMapping("/registration")
    public String registration(@Valid @ModelAttribute("userRegistrationDTO") UserRegistrationDTO userRegistrationDTO, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "registration";
        }
        if (accountService.checkUniquenessPhoneNumber(userRegistrationDTO.getPhone())) {
            model.addAttribute("errorMessage", "Пользователь с таким номером уже зарегестрирован");
           return "registration";
        }
        accountService.registration(userRegistrationDTO);
        return "redirect:/login";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public String login(@Valid UserLoginDTO loginDTO, Model model) {
        if(accountService.login(loginDTO)){
            Account account = accountDAO.findByPhone(loginDTO.getPhone()).get();
            session.setAttribute("currentUser", account);
            return "redirect:/profile";
        } else {
            model.addAttribute("WrongPhoneOrPassword", "Неверный номер телефона или пароль");
            return "login";
        }
    }

    @GetMapping("/profile")
    public String index(HttpSession session, Model model) {
        Account account = (Account) session.getAttribute("currentUser");
        UserDTO userDto = userService.createUser(account.getId());

        model.addAttribute("username",userDto.getUsername());
        model.addAttribute("phone",userDto.getPhoneNumber());
        model.addAttribute("role",userDto.getRole());
        model.addAttribute("ID",userDto.getId());

        return "personal_account";
    }

    @PostMapping("/profile")
    public String registration(@RequestParam("username") String newUsername,
                               @RequestParam("phone") String newPhone,
                               @RequestParam("password") String newPassword,
                               HttpSession session) {

        Account account = (Account) session.getAttribute("currentUser");
        Account user = userDAO.findByID(account.getId()).get();

        user.setUsername(newUsername);
        user.setPhone(newPhone);
        user.setPassword(newPassword);

        userDAO.update(account.getId(), user);
        return "redirect:/profile";
    }
}

