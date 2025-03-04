package by.tms.onlinerclone31onl.domain.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ShopProductDTO {
    private Long id;
    private Double price;
    private Integer status;
    private String shopName;
}
