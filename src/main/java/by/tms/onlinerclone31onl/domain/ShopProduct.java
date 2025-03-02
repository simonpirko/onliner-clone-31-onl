package by.tms.onlinerclone31onl.domain;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class ShopProduct {
    private String id;
    private Double price;
    private Integer status;
    private Shop shop;
    private Product product;
}
