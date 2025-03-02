package by.tms.onlinerclone31onl.dao.mappers;

import by.tms.onlinerclone31onl.dao.CategoryDAO;
import by.tms.onlinerclone31onl.dao.ManufacturerDAO;
import by.tms.onlinerclone31onl.domain.Category;
import by.tms.onlinerclone31onl.domain.Manufacturer;
import by.tms.onlinerclone31onl.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class ProductMapper implements RowMapper<Product> {
    @Autowired
    private CategoryDAO categoryDAO;
    @Autowired
    private ManufacturerDAO manufacturerDAO;
    @Override
    public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
        Product product = new Product();
        product.setProductId(rs.getString("productId"));
        product.setName(rs.getString("name"));
        product.setDescription(rs.getString("description"));
        product.setCharacteristic(rs.getString("characteristic"));
        product.setYear(rs.getInt("year"));
        Category category = categoryDAO.findByID(rs.getString("id_category")).get();
        product.setCategory(category);
        Manufacturer manufacturer = manufacturerDAO.findByID(rs.getString("id_manufacturer")).get();
        product.setManufacturer(manufacturer);

        return product;
    }
}
