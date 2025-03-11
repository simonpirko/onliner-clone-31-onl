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
        jdbcTemplate.update("INSERT INTO account VALUES (default,?,?,?)",entity.getId(),entity.getUsername(),entity.getPhone(),entity.getRole());
    }

    @Override
    public void delete(Account entity) {
        jdbcTemplate.update("DELETE FROM account WHERE id=?",entity.getId());
    }

    @Override
    public void deleteById(Long id) {
        jdbcTemplate.update("DELETE FROM account WHERE id=?",id);
    }

    @Override
    public void update(Long id, Account entity) {
        jdbcTemplate.update("UPDATE account SET username = ?,phone = ?, password = crypt(?, gen_salt('md5'))  WHERE id = ?",entity.getUsername(),entity.getPhone(), entity.getPassword(), id);
    }

    @Override
    public List<Account> findAll() {
        return jdbcTemplate.query("SELECT * FROM account", rowMapper);
    }


    @Override
    public Optional<Account> findByID(Long id) {
        return Optional.ofNullable(jdbcTemplate.queryForObject("SELECT * FROM account WHERE id=?",rowMapper, id));
    }

    public Optional<Account> findByPhone(String phone) {
        return Optional.ofNullable(jdbcTemplate.queryForObject("SELECT * FROM account WHERE phone=?",rowMapper, phone));
    }
}
