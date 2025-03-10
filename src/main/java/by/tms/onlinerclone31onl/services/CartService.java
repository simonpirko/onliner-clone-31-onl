package by.tms.onlinerclone31onl.services;

import by.tms.onlinerclone31onl.dao.AccountDAO;
import by.tms.onlinerclone31onl.dao.ShopProductDAO;
import by.tms.onlinerclone31onl.domain.Cart;
import by.tms.onlinerclone31onl.domain.CartItem;
import by.tms.onlinerclone31onl.domain.OrderDetails;
import by.tms.onlinerclone31onl.domain.dto.CartDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Service
public class CartService {
    private final Map<Long, OrderDetails> cart = new HashMap<>();
    @Autowired
    private AccountDAO accountDAO;
    @Autowired
    private ShopProductDAO shopProductDAO;

    public Cart addProductToCart(CartDTO cartDTO) {
        Cart cart = cartDTO.getCart();
        cart.setAccount(accountDAO.findByID(cartDTO.getAccountID()).orElseThrow(() -> new RuntimeException("Account not found")));
        if (cart.getCartItems() == null) {
            cart.setCartItems(new ArrayList<>());
        }
        cart.getCartItems().add(new CartItem(shopProductDAO.findByProductIDAndShopID(cartDTO.getProductID(), cartDTO.getShopID())
                .orElseThrow(() -> new RuntimeException("Product not found"))));
        return cart;
    }

    public void removeFromCart(Long productId) {
        cart.remove(productId);
    }

    public void changeQuantity(Long productId, int quantity) {
        if (cart.containsKey(productId)) {
            if (quantity > 0) {
                cart.get(productId).setQuantity(quantity);
            } else {
                cart.remove(productId);
            }
        }
    }

    public Map<Long, OrderDetails> getCartItems() {
        return cart;
    }

    public double getTotalPrice() {
        return cart.values().stream().mapToDouble(item -> item.getPrice() * item.getQuantity()).sum();
    }
}
