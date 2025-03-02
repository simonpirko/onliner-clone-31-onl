package by.tms.onlinerclone31onl.dao;

import by.tms.onlinerclone31onl.dao.mappers.ShopProductMapper;
import by.tms.onlinerclone31onl.domain.Shop;
import by.tms.onlinerclone31onl.domain.dto.ShopProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Component
public class ShopProductDAO implements DataAccessObject<Shop> {
    private final JdbcTemplate jdbcTemplate;
    private final ShopProductMapper rowMapper;

    @Autowired
    public ShopProductDAO(JdbcTemplate jdbcTemplate, ShopProductMapper rowMapper) {
        this.jdbcTemplate = jdbcTemplate;
        this.rowMapper = rowMapper;
    }


    @Override
    public void save(Shop entity) {

    }

    @Override
    public void delete(Shop entity) {

    }

    @Override
    public void deleteById(String id) {

    }

    @Override
    public void update(String id, Shop entity) {

    }

    @Override
    public List<Shop> findAll() {
        return List.of();
    }

    @Override
    public Optional<Shop> findByID(String id) {
        return Optional.empty();
    }

    public List<Map<String, Object>> findAllByIdProduct(String productId) {
        return jdbcTemplate.queryForList("select * from shopproduct where product_id = ?", productId);
    }
}
