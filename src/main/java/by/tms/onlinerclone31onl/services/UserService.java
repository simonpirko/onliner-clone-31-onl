package by.tms.onlinerclone31onl.services;

import by.tms.onlinerclone31onl.dao.UserDAO;
import by.tms.onlinerclone31onl.domain.Account;
import by.tms.onlinerclone31onl.domain.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserDAO userDAO;

    public UserDTO createUser(Long id) {
        Account user = userDAO.findByID(id).get();

        UserDTO userDto = new UserDTO();

        userDto.setId(user.getId());
        userDto.setUsername(user.getUsername());
        userDto.setPhoneNumber(user.getPhone());
        userDto.setRole(String.valueOf(user.getRole()));

        return userDto;
    }
}
