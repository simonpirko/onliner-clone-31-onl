package by.tms.onlinerclone31onl.domain;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Shop {
    private String id;
    private String name;
    private String description;
    private String address;
    private Account account;
}
