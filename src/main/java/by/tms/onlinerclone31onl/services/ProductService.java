package by.tms.onlinerclone31onl.services;

import by.tms.onlinerclone31onl.domain.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class ProductService {
    private final List<Product> products = new ArrayList<>();

    public Product getProductById(Long id) {
        return products.stream()
                .filter(product -> Objects.equals(product.getId(), id))
                .findFirst()
                .orElse(null);
    }

    public List<Product> getAllProducts() {
        return products;
    }
}
