package by.tms.onlinerclone31onl.dao;

import by.tms.onlinerclone31onl.dao.mappers.AccountMapper;
import by.tms.onlinerclone31onl.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Optional;

public class UserDAO implements DataAccessObject<Account> {
    private final JdbcTemplate jdbcTemplate;
    private final AccountMapper rowMapper;

    @Autowired
    public UserDAO(JdbcTemplate jdbcTemplate, AccountMapper rowMapper) {
        this.jdbcTemplate = jdbcTemplate;
        this.rowMapper = rowMapper;
    }

    @Override
    public void save(Account entity) {
        jdbcTemplate.update("INSERT INTO customer VALUES (default,?,?,?,?,?)",entity.getAccount().getId(),entity.getFirstName(),entity.getLastName(),entity.getPhone(),entity.getAddress());
    }

    @Override
    public void delete(Account entity) {
        jdbcTemplate.update("DELETE FROM customer WHERE id=?",entity.getId());
    }

    @Override
    public void deleteById(String id) {
        jdbcTemplate.update("DELETE FROM customer WHERE id=?",id);
    }

    @Override
    public void update(String id, Account entity) {
        jdbcTemplate.update("UPDATE customer SET first_name = ?,last_name = ?,phone = ?, address = ? WHERE id = ?",entity.getUsername(),entity.getLastName(),entity.getPhone(),entity.getAddress(),id);
    }

    @Override
    public List<Account> findAll() {
        return jdbcTemplate.query("SELECT * FROM customer", rowMapper);
    }

    @Override
    public Optional<Account> findByPhone(String phone) {
        return Optional.empty();
    }

    @Override
    public Optional<Account> findByID(String id) {
        return Optional.ofNullable(jdbcTemplate.queryForObject("SELECT * FROM customer WHERE id=?",rowMapper, id));
    }
}
