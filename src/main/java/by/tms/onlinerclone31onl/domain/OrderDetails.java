package by.tms.onlinerclone31onl.domain;

import lombok.Getter;
import lombok.Setter;

public class OrderDetails {
    @Getter
    private Product product;
    @Getter
    @Setter
    private int quantity;

    public OrderDetails(Product product, int i) {
        this.product = product;
        this.quantity = i;
    }


}
