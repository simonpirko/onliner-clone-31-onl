package by.tms.onlinerclone31onl.dao;

import by.tms.onlinerclone31onl.dao.mappers.ManufacturerMapper;
import by.tms.onlinerclone31onl.domain.Manufacturer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ManufacturerDAO implements DataAccessObject<Manufacturer> {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private ManufacturerMapper rowMapper;

    public ManufacturerDAO(ManufacturerMapper rowMapper, JdbcTemplate jdbcTemplate) {
        this.rowMapper = rowMapper;
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void save(Manufacturer entity) {

    }

    @Override
    public void delete(Manufacturer entity) {

    }

    @Override
    public void deleteById(String id) {

    }

    @Override
    public void update(String id, Manufacturer entity) {

    }

    @Override
    public List<Manufacturer> findAll() {
        return List.of();
    }

    @Override
    public Optional<Manufacturer> findByID(String id) {
        return Optional.ofNullable(jdbcTemplate.queryForObject("SELECT * FROM manufacturer WHERE id = ?",
                rowMapper, id));
    }
}
