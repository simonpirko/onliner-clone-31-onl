package by.tms.onlinerclone31onl.domain;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class ProductImages {
    private String id;
    private String photo;
    private Product product;
}
