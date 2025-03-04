package by.tms.onlinerclone31onl.domain;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Orders {
    private Long id;
    private Integer status;
    private String description;
    private String address;
    private Account account;
    private Shop shop;
}
