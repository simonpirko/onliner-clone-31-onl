package by.tms.onlinerclone31onl.dao;

import by.tms.onlinerclone31onl.dao.mappers.CategoryMapper;
import by.tms.onlinerclone31onl.domain.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public class CategoryDAO implements DataAccessObject<Category> {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private CategoryMapper rowMapper;

    public CategoryDAO(JdbcTemplate jdbcTemplate, CategoryMapper rowMapper) {
        this.jdbcTemplate = jdbcTemplate;
        this.rowMapper = rowMapper;
    }

    @Override
    public void save(Category entity) {

    }

    @Override
    public void delete(Category entity) {

    }

    @Override
    public void deleteById(String id) {

    }

    @Override
    public void update(String id, Category entity) {

    }

    @Override
    public List<Category> findAll() {
        return List.of();
    }

    @Override
    public Optional<Category> findByID(String id) {
        return Optional.ofNullable(jdbcTemplate.queryForObject("SELECT * FROM category WHERE id = ?",
                rowMapper, id));
    }
}
