package by.tms.onlinerclone31onl.dao.mappers;

import by.tms.onlinerclone31onl.domain.Account;
import org.springframework.stereotype.Component;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class AccountMapper implements RowMapper<Account> {
    @Override
    public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
        Account account = new Account();
        account.setId(rs.getString("id"));
        account.setUsername(rs.getString("username"));
        account.setPassword(rs.getString("password"));
        account.setPhone(rs.getString("phone"));
        account.setPhoto(rs.getString("photo"));
        account.setRole(Account.Role.valueOf(rs.getString("role")));
        return account;
    }
}
