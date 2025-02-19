package by.tms.onlinerclone31onl.services;

import by.tms.onlinerclone31onl.domain.OrderDetails;
import by.tms.onlinerclone31onl.domain.Product;
import org.springframework.stereotype.Service;


import java.util.HashMap;
import java.util.Map;

@Service
public class CartService {
  private final Map<Long, OrderDetails> cart = new HashMap<>();

  public void addToCart(Product product) {
      cart.compute((long) product.getId(), (id, cartItem) ->
              cartItem == null ? new OrderDetails(product, 1) :
                      new OrderDetails(product, cartItem.getQuantity() + 1 ));
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
        return cart.values().stream().mapToDouble(item -> item.getProduct().getPrice() * item.getQuantity()).sum();
    }


}
