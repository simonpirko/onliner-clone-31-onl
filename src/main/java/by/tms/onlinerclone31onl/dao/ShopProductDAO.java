package by.tms.onlinerclone31onl.dao;

import by.tms.onlinerclone31onl.dao.mappers.ShopProductMapper;
import by.tms.onlinerclone31onl.domain.ShopProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Component
public class ShopProductDAO implements DataAccessObject<ShopProduct> {
    private final JdbcTemplate jdbcTemplate;
    private final ShopProductMapper rowMapper;

    @Autowired
    public ShopProductDAO(JdbcTemplate jdbcTemplate, ShopProductMapper rowMapper) {
        this.jdbcTemplate = jdbcTemplate;
        this.rowMapper = rowMapper;
    }


    @Override
    public void save(ShopProduct entity) {

    }

    @Override
    public void delete(ShopProduct entity) {

    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void update(Long id, ShopProduct entity) {

    }

    @Override
    public List<ShopProduct> findAll() {
        return List.of();
    }

    @Override
    public Optional<ShopProduct> findByID(Long id) {
        return Optional.empty();
    }

    public List<Map<String, Object>> findAllByIdProduct(Long productId) {
        return jdbcTemplate.queryForList("select * from shopproduct where product_id = ?", productId);
    }

    public Optional<ShopProduct> findByProductIDAndShopID (Long productID, Long shopID) {
        return Optional.ofNullable(jdbcTemplate.queryForObject("select * from shopproduct where product_id = ? and shop_id = ?", rowMapper, productID, shopID));
    }
}
