package by.tms.onlinerclone31onl.domain;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class OrderDetails {
    private Long id;
    private Double price;
    private Orders order;
    private ShopProduct shopProduct;
}
