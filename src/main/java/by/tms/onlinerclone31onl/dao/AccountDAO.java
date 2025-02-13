package by.tms.onlinerclone31onl.dao;

import by.tms.onlinerclone31onl.dao.mappers.AccountMapper;
import by.tms.onlinerclone31onl.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class AccountDAO implements DataAccessObject<Account> {
    private final JdbcTemplate jdbcTemplate;
    private final AccountMapper rowMapper;

    @Autowired
    public AccountDAO(JdbcTemplate jdbcTemplate, AccountMapper rowMapper) {
        this.jdbcTemplate = jdbcTemplate;
        this.rowMapper = rowMapper;
    }

    @Override
    public void save(Account entity) {
        jdbcTemplate.update("INSERT INTO account VALUES (default,?,?,?,?,?)", entity.getUsername(), entity.getLogin(),
                entity.getPassword(), entity.getPhone(), entity.getRole().name().toUpperCase());
    }

    @Override
    public void delete(Account entity) {

    }

    @Override
    public void deleteById(String id) {

    }

    @Override
    public void update(String id, Account entity) {

    }

    @Override
    public List<Account> findAll() {
        return jdbcTemplate.query("SELECT * FROM account", rowMapper);
    }

    @Override
    public Optional<Account> findByID(String id) {
        return Optional.empty();
    }
}
