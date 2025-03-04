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
        return List.of();
    }

    @Override
    public Optional<Account> findByID(String id) {
        return Optional.empty();
    }

    @Override
    public Optional<Account> findByPhone(String phone) {
        return Optional.empty();
    }
}
