package by.tms.onlinerclone31onl.dao.mappers;

import by.tms.onlinerclone31onl.dao.ProductDAO;
import by.tms.onlinerclone31onl.dao.ShopDAO;
import by.tms.onlinerclone31onl.domain.Product;
import by.tms.onlinerclone31onl.domain.Shop;
import by.tms.onlinerclone31onl.domain.ShopProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class ShopProductMapper implements RowMapper<ShopProduct> {

    @Autowired
    private ProductDAO productDAO;

    @Autowired
    private ShopDAO shopDAO;

    @Override
    public ShopProduct mapRow(ResultSet rs, int rowNum) throws SQLException {
        ShopProduct shopProduct = new ShopProduct();
        shopProduct.setId(rs.getLong("id"));
        shopProduct.setPrice(rs.getDouble("price"));
        shopProduct.setStatus(rs.getInt("status"));
        Product product = productDAO.findByID(rs.getLong("product_id")).get();
        shopProduct.setProduct(product);
        Shop shop = shopDAO.findByID(rs.getLong("shop_id")).get();
        shopProduct.setShop(shop);

        return shopProduct;
    }
}
