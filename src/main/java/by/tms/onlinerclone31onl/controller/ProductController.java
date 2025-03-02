package by.tms.onlinerclone31onl.controller;

import by.tms.onlinerclone31onl.services.ProductService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ProductController {
    private ProductService productService;

    @Autowired
    HttpSession session;

}
