package by.tms.onlinerclone31onl.domain.dto;
import by.tms.onlinerclone31onl.domain.Account;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class UserDTO {
    private Long id;
    private String username;
    private String phoneNumber;
    private String role;
}
