package by.tms.onlinerclone31onl.dao;

import by.tms.onlinerclone31onl.dao.mappers.AccountMapper;
import by.tms.onlinerclone31onl.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
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
        jdbcTemplate.update("INSERT INTO account VALUES (default,?,crypt(?, gen_salt('md5')),?,?,?)", entity.getUsername(),
                entity.getPassword(), entity.getPhone(), entity.getRole().name().toUpperCase(),  entity.getPhoto());
    }

    @Override
    public void delete(Account entity) {

    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void update(Long id, Account entity) {

    }

    @Override
    public List<Account> findAll() {
        return jdbcTemplate.query("SELECT * FROM account", rowMapper);
    }

    @Override
    public Optional<Account> findByID(Long id) {
        return Optional.ofNullable(jdbcTemplate.queryForObject("SELECT * FROM account WHERE id=?", rowMapper, id));
    }


    public Optional<Account> findByPhone(String phone) {
        return Optional.ofNullable(jdbcTemplate.queryForObject("SELECT * FROM account WHERE phone=?", rowMapper, phone));
    }

    public Optional<Account> findByPhoneAndPassword(String phone, String password) {
        try {
            return Optional.ofNullable(jdbcTemplate.queryForObject("SELECT * FROM account WHERE phone = ? AND password = crypt(?, password)", rowMapper, phone, password));
        } catch (EmptyResultDataAccessException e) {
            return Optional.empty();
        }
    }
}
