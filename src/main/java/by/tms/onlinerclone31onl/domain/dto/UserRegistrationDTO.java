package by.tms.onlinerclone31onl.domain.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class UserRegistrationDTO {

    @NotBlank
    @NotNull
    private String username;
    @NotBlank
    @NotNull
    private String login;
    @NotBlank
    private String password;
    @NotBlank
    private String phone;
    private String role;
}