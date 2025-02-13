package by.tms.onlinerclone31onl.domain;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Account {

    private String id;
    private String username;
    private String login;
    private String password;
    private String phone;
    private Role role;

    public enum Role {
        ADMIN, USER, BUSINESS
    }

}