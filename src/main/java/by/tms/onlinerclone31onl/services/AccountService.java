package by.tms.onlinerclone31onl.services;

import by.tms.onlinerclone31onl.dao.AccountDAO;
import by.tms.onlinerclone31onl.domain.Account;
import by.tms.onlinerclone31onl.domain.dto.UserRegistrationDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    AccountDAO accountDAO;

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
}