package by.tms.onlinerclone31onl.dao.mappers;

import by.tms.onlinerclone31onl.dao.AccountDAO;
import by.tms.onlinerclone31onl.domain.Account;
import by.tms.onlinerclone31onl.domain.Shop;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class ShopMapper implements RowMapper<Shop> {

    private AccountDAO accountDAO;

    @Override
    public Shop mapRow(ResultSet rs, int rowNum) throws SQLException {
        Shop shop = new Shop();
        Account account = accountDAO.findByID(rs.getString("account_id")).get();
        shop.setAccount(account);
        shop.setId(rs.getString("id"));
        shop.setName(rs.getString("name"));
        shop.setDescription(rs.getString("description"));
        shop.setAddress(rs.getString("address"));

        return shop;
    }
}
