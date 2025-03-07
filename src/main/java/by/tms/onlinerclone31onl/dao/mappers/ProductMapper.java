package by.tms.onlinerclone31onl.dao.mappers;

import by.tms.onlinerclone31onl.dao.CategoryDAO;
import by.tms.onlinerclone31onl.dao.ManufacturerDAO;
import by.tms.onlinerclone31onl.dao.ProductImagesDAO;
import by.tms.onlinerclone31onl.domain.Category;
import by.tms.onlinerclone31onl.domain.Manufacturer;
import by.tms.onlinerclone31onl.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Component
public class ProductMapper implements RowMapper<Product> {
    @Autowired
    private CategoryDAO categoryDAO;
    @Autowired
    private ManufacturerDAO manufacturerDAO;
    @Autowired
    private ProductImagesDAO productImagesDAO;

    @Override
    public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
        Product product = new Product();
        product.setProductId(rs.getLong("id"));
        product.setName(rs.getString("name"));
        product.setDescription(rs.getString("description"));
        product.setCharacteristic(rs.getString("characteristics"));
        product.setYear(rs.getInt("year"));
        Category category = categoryDAO.findByID(rs.getLong("category_id")).get();
        product.setCategory(category);
        Manufacturer manufacturer = manufacturerDAO.findByID(rs.getLong("manufacturer_id")).get();
        product.setManufacturer(manufacturer);
        List<String> images = productImagesDAO.findByIDAll(rs.getLong("id"));
        product.setImages(images);

        return product;
    }
}
