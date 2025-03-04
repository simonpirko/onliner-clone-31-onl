package by.tms.onlinerclone31onl.dao;

import by.tms.onlinerclone31onl.dao.mappers.ProductImagesMapper;
import by.tms.onlinerclone31onl.domain.ProductImages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductImagesDAO implements DataAccessObject<ProductImages> {

    @Autowired
    private final JdbcTemplate jdbcTemplate;
    @Autowired
    private final ProductImagesMapper rowMapper;

    public ProductImagesDAO(JdbcTemplate jdbcTemplate, ProductImagesMapper rowMapper) {
        this.jdbcTemplate = jdbcTemplate;
        this.rowMapper = rowMapper;
    }

    @Override
    public void save(ProductImages entity) {

    }

    @Override
    public void delete(ProductImages entity) {

    }

    @Override
    public void deleteById(String id) {

    }

    @Override
    public void update(String id, ProductImages entity) {

    }

    @Override
    public List<ProductImages> findAll() {
        return List.of();
    }

    @Override
    public Optional<ProductImages> findByID(Long id) {
        return Optional.empty();
    }


    public List<String> findByIDAll(Long productId) {
    return jdbcTemplate.queryForList("SELECT path FROM productimages WHERE product_id = ?", String.class, productId);
    }
}
