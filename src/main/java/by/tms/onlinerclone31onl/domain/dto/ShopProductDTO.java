package by.tms.onlinerclone31onl.domain.dto;

import by.tms.onlinerclone31onl.domain.Product;
import by.tms.onlinerclone31onl.domain.Shop;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ShopProductDTO {
    private String id;
    private Double price;
    private Integer status;
    private Product product;
    private Shop shop;
}
