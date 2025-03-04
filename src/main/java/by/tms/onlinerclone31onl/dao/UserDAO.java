package by.tms.onlinerclone31onl.dao;

import by.tms.onlinerclone31onl.dao.mappers.AccountMapper;
import by.tms.onlinerclone31onl.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
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
        jdbcTemplate.update("INSERT INTO customers VALUES (default,?,?,?)",entity.getId(),entity.getUsername(),entity.getPhone(),entity.getRole());
    }

    @Override
    public void delete(Account entity) {
        jdbcTemplate.update("DELETE FROM customers WHERE id=?",entity.getId());
    }

    @Override
    public void deleteById(String id) {
        jdbcTemplate.update("DELETE FROM customers WHERE id=?",id);
    }

    @Override
    public void update(String id, Account entity) {
        jdbcTemplate.update("UPDATE customers SET id_account = ?,username = ?,phone = ?, role = ? WHERE id = ?",entity.getId(),entity.getUsername(),entity.getPhone(),entity.getRole(),id);
    }

    @Override
    public List<Account> findAll() {
        return jdbcTemplate.query("SELECT * FROM customers", rowMapper);
    }

    @Override
    public Optional<Account> findByID(String id) {
        return Optional.ofNullable(jdbcTemplate.queryForObject("SELECT * FROM customers WHERE id=?",rowMapper, id));
    }

    @Override
    public Optional<Account> findByPhone(String phone) {
        return Optional.ofNullable(jdbcTemplate.queryForObject("SELECT * FROM customers WHERE phone=?",rowMapper, phone));
    }
}
