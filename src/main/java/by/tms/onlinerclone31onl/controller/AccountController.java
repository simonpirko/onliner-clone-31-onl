package by.tms.onlinerclone31onl.controller;

import by.tms.onlinerclone31onl.domain.dto.UserRegistrationDTO;
import by.tms.onlinerclone31onl.services.AccountService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AccountController {

    @Autowired
    AccountService accountService;

    @GetMapping("/registration")
    public String registration(@ModelAttribute("userRegistrationDTO") UserRegistrationDTO userRegistrationDTO) {
        return "registration";
    }

    @PostMapping("/registration")
    public String registration(@Valid @ModelAttribute("userRegistrationDTO") UserRegistrationDTO userRegistrationDTO, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "registration";
        }
//        if (accountService.checkUniquenessPhoneNumber(userRegistrationDTO.getPhone())) {
//            model.addAttribute("errorMessage", "Пользователь с таким номером уже зарегестрирован");
//           return "registration";
//        }
        accountService.registration(userRegistrationDTO);
        return "redirect:/home";
    }
}

