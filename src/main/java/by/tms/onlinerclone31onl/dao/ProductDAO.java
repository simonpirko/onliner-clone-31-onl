package by.tms.onlinerclone31onl.dao;

import by.tms.onlinerclone31onl.dao.mappers.ProductMapper;
import by.tms.onlinerclone31onl.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductDAO implements DataAccessObject<Product> {


    private final JdbcTemplate jdbcTemplate;
    private final ProductMapper rowMapper;

    @Autowired
    public ProductDAO(JdbcTemplate jdbcTemplate, ProductMapper rowMapper) {
        this.jdbcTemplate = jdbcTemplate;
        this.rowMapper = rowMapper;
    }

    @Override
    public void save(Product entity) {
        jdbcTemplate.update("INSERT INTO product VALUES (DEFAULT, ?, ?, ?, ?, ?, ?)", entity.getName(), entity.getDescription(),
                entity.getCharacteristic(), entity.getYear(), entity.getCategory().getId(), entity.getManufacturer().getId());
    }

    @Override
    public void delete(Product entity) {

    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void update(Long id, Product entity) {

    }

    @Override
    public List<Product> findAll() {
        return jdbcTemplate.query("SELECT * FROM product", rowMapper);
    }

    @Override
    public Optional<Product> findByID(Long id) {
        return Optional.ofNullable( jdbcTemplate.queryForObject("SELECT * FROM product WHERE id=?", rowMapper, id));
    }

    public Optional<Product> findAllByID(Long id) {
        return Optional.ofNullable( jdbcTemplate.queryForObject("SELECT * FROM product WHERE id =?", rowMapper, id));
    }
}
