package by.tms.onlinerclone31onl.controller;

import by.tms.onlinerclone31onl.domain.Cart;
import by.tms.onlinerclone31onl.domain.Product;
import by.tms.onlinerclone31onl.domain.dto.CartDTO;
import by.tms.onlinerclone31onl.services.CartService;
import by.tms.onlinerclone31onl.services.ProductService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Collectors;

@Controller
@RequestMapping("/cart")
public class CartController {
    private final CartService cartService;
    private final ProductService productService;


    public CartController(CartService cartService, ProductService productService) {
        this.cartService = cartService;
        this.productService = productService;
    }

    @GetMapping
    public String showCart(Model model) {
        model.addAttribute("cart", cartService.getCartItems().values());
        model.addAttribute("totalPrice", cartService.getTotalPrice());
        return "cart";
    }

    @PostMapping
    public String addProductToCart(@RequestParam("productID") Long productID,
                                   @RequestParam("shopID") Long shopID,
                                   @RequestParam("accountID") Long accountID,
                                   Model model, HttpSession session) {
        if (accountID == null) {
            return "redirect:/product" + productID;
        }
        Cart cart = (Cart) session.getAttribute("cart");
        CartDTO cartDTO = new CartDTO(productID, accountID, shopID, cart);
        session.setAttribute("cart", cartService.addProductToCart(cartDTO));
        return "redirect:/cart";

    }

    @PostMapping("/delete")
    public String deleteItemCart(@RequestParam("itemID") long idItem, Model model, HttpSession session) {
        Cart cart = (Cart) session.getAttribute("cart");

        cart.getCartItems().removeIf(cartItem -> cartItem.getShopProduct().getId() == idItem);

        session.setAttribute("cart", cart);
        return "redirect:/cart";
    }

    @PostMapping("/update/{id}")
    public String updateQuantity(@PathVariable Long id, @RequestParam int quantity) {
        cartService.changeQuantity(id, quantity);
        return "redirect:/cart";
    }
}
