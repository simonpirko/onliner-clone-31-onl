package by.tms.onlinerclone31onl.domain.dto;

import by.tms.onlinerclone31onl.domain.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProductDTO {
    private Product product;
    List<ShopProductDTO> shopProductsDTOList;
}
