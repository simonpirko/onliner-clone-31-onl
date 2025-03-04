package by.tms.onlinerclone31onl.controller;

import by.tms.onlinerclone31onl.domain.Account;
import by.tms.onlinerclone31onl.services.ProductService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;
    @Autowired
    HttpSession session;

    @GetMapping("/product/{productID}")
    public String page(@PathVariable(value = "productID") Long productID, Model model) {
        model.addAttribute("productDTO", productService.getProductPage(productID));
        Account currentUser = (Account) session.getAttribute("currentUser");
        model.addAttribute("CurrentUser",currentUser);
        return "product";
    }
}
