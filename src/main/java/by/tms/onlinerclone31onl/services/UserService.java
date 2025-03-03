package by.tms.onlinerclone31onl.services;
import by.tms.onlinerclone31onl.domain.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    public UserDTO getUser(String id){
        UserDTO user = new UserDTO();

    }
}
