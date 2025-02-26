package by.tms.onlinerclone31onl.domain.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserLoginDTO {
    @NotBlank
    @Pattern(message = "Неверный формат номера телефона", regexp = "^\\+375\\(\\d{2}\\)\\d{3}-\\d{2}-\\d{2}$")
    private String phone;
    @NotNull
    @NotBlank
    private String password;
}
