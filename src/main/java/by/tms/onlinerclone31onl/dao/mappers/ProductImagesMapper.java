package by.tms.onlinerclone31onl.dao.mappers;

import by.tms.onlinerclone31onl.dao.ProductDAO;
import by.tms.onlinerclone31onl.domain.Product;
import by.tms.onlinerclone31onl.domain.ProductImages;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductImagesMapper implements RowMapper<ProductImages> {

    private ProductDAO productDAO;
    @Override
    public ProductImages mapRow(ResultSet rs, int rowNum) throws SQLException {
        ProductImages productImg = new ProductImages();
        productImg.setId(rs.getString("id"));
        productImg.setPhoto(rs.getString("photo"));
        Product product = productDAO.findByID(rs.getString("id_product")).get();
        productImg.setProduct(product);

        return productImg;
    }
}
