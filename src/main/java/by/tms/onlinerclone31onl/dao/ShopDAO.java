package by.tms.onlinerclone31onl.dao;

import by.tms.onlinerclone31onl.dao.mappers.ShopMapper;
import by.tms.onlinerclone31onl.domain.Shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ShopDAO implements DataAccessObject<Shop> {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private ShopMapper rowMapper;

    public ShopDAO(ShopMapper rowMapper, JdbcTemplate jdbcTemplate) {
        this.rowMapper = rowMapper;
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void save(Shop entity) {

    }

    @Override
    public void delete(Shop entity) {

    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void update(Long id, Shop entity) {

    }

    @Override
    public List<Shop> findAll() {
        return List.of();
    }

    @Override
    public Optional<Shop> findByID(Long id) {
        return Optional.ofNullable(jdbcTemplate.queryForObject("SELECT * FROM shop WHERE id=?",rowMapper, id));
    }
}
