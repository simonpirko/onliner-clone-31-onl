package by.tms.onlinerclone31onl.domain.dto;
import by.tms.onlinerclone31onl.domain.Account;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class UserDTO {
    private Account account;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String role;
}
