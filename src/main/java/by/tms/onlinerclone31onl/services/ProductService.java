package by.tms.onlinerclone31onl.services;

import by.tms.onlinerclone31onl.dao.*;
import by.tms.onlinerclone31onl.domain.dto.ProductDTO;
import by.tms.onlinerclone31onl.domain.dto.ShopProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class ProductService {

    @Autowired
    private ProductDAO productDAO;

    @Autowired
    private ShopDAO shopDAO;
    @Autowired
    ShopProductDAO shopProductDAO;

    public ProductDTO getProductPage(Long id) {
        ProductDTO productDTO = new ProductDTO();
        productDTO.setProduct(productDAO.findAllByID(id).orElseThrow(() -> new RuntimeException("Product not found")));

        List<Map<String, Object>> allByIDProduct = shopProductDAO.findAllByIdProduct(id);
        List<ShopProductDTO> productShopDTOList = allByIDProduct.stream()
                .map(this::mapToProductShopDTO)
                .collect(Collectors.toList());

        productDTO.getProduct().setImages(productDTO.getProduct().getImages());
        productDTO.setShopProductsDTOList(productShopDTOList);

        return productDTO;
    }

    private ShopProductDTO mapToProductShopDTO(Map<String, Object> map) {
        ShopProductDTO productShopDTO = new ShopProductDTO();
        Long shop_id = (Long) map.get("shop_id");
        productShopDTO.setId(shop_id);
        productShopDTO.setShopName(shopDAO.findByID(shop_id).orElseThrow(() -> new RuntimeException("Shop not found")).getName());

        productShopDTO.setPrice(Double.valueOf(map.get("price").toString()));
        productShopDTO.setStatus(Integer.parseInt(map.get("status").toString()));

        return productShopDTO;
    }


}
