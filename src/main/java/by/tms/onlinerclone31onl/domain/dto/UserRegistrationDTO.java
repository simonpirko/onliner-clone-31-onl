package by.tms.onlinerclone31onl.domain.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
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
    @Pattern(message = "Неверный формат номера телефона", regexp = "^\\+375\\(\\d{2}\\)\\d{3}-\\d{2}-\\d{2}$")
    private String phone;
    private String role;
}