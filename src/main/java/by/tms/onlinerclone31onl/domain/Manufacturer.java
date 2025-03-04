package by.tms.onlinerclone31onl.domain;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Manufacturer {

    private Long id;
    private String name;
    private String description;
}
