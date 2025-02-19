package by.tms.onlinerclone31onl.controller;

import by.tms.onlinerclone31onl.domain.Cart;
import by.tms.onlinerclone31onl.domain.Product;
import by.tms.onlinerclone31onl.services.CartService;
import by.tms.onlinerclone31onl.services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/ass/{id}")
    public String addToCart(@PathVariable Long id, Model model) {
        Product product = productService.getProductById(id);
        if (product != null) {
            cartService.addToCart(product);
        }
        return "redirect:/cart";
    }

    @PostMapping("/remove/{id}")
    public String removeCart(@PathVariable Long id) {
        cartService.removeFromCart(id);
        return "redirect:/cart";
    }

    @PostMapping("/update/{id}")
    public String updateQuantity(@PathVariable Long id, @RequestParam int quantity) {
        cartService.changeQuantity(id, quantity);
        return "redirect:/cart";
    }
}
