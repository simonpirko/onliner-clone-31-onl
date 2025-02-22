package by.tms.onlinerclone31onl.services;

import by.tms.onlinerclone31onl.dao.AccountDAO;
import by.tms.onlinerclone31onl.domain.Account;
import by.tms.onlinerclone31onl.domain.dto.UserLoginDTO;
import by.tms.onlinerclone31onl.domain.dto.UserRegistrationDTO;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountService {

    @Autowired
    AccountDAO accountDAO;
    @Autowired
    private HttpSession httpSession;

    public void registration (UserRegistrationDTO userRegistrationDTO) {
        Account account = new Account();
        account.setUsername(userRegistrationDTO.getUsername());
        account.setLogin(userRegistrationDTO.getLogin());
        account.setPassword(userRegistrationDTO.getPassword());
        account.setPhone(userRegistrationDTO.getPhone());
        account.setRole(Account.Role.USER);
        accountDAO.save(account);
    }

    public boolean checkUniquenessPhoneNumber(String phone) {
        List<Account> account = accountDAO.findAll();
        for (Account a : account) {
            if (a.getPhone().equals(phone)) {
                return true;
            }
        }
        return false;
    }
    public boolean login (UserLoginDTO loginDTO) {
        Optional<Account> account = accountDAO.findByPhoneAndPassword(loginDTO.getPhone(), loginDTO.getPassword());
        if (account.isPresent()) {
                httpSession.setAttribute("currentUser", account.get());
                return true;
        }
        return false;
    }
}