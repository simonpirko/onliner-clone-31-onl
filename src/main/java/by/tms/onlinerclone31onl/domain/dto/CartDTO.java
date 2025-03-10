package by.tms.onlinerclone31onl.domain.dto;

import by.tms.onlinerclone31onl.domain.Cart;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CartDTO {
    private Long productID;
    private Long accountID;
    private Long shopID;
    private Cart cart;
}
