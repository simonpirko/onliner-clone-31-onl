package by.tms.onlinerclone31onl.domain;

import lombok.*;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Cart {
    private Account account;
    private Long id;
    private ArrayList<CartItem> cartItems;
}
