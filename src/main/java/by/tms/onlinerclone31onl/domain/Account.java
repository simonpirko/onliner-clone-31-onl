package by.tms.onlinerclone31onl.domain;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Account {

    private Long id;
    private String username;
    private String password;
    private String phone;
    private String photo;
    private Role role;

    public enum Role {
        ADMIN, USER, BUSINESS
    }

}