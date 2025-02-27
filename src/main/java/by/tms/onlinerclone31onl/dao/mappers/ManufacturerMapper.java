package by.tms.onlinerclone31onl.dao.mappers;

import by.tms.onlinerclone31onl.domain.Manufacturer;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class ManufacturerMapper implements RowMapper<Manufacturer> {
    @Override
    public Manufacturer mapRow(ResultSet rs, int rowNum) throws SQLException {
        Manufacturer manufacturer = new Manufacturer();
        manufacturer.setId(rs.getString("id"));
        manufacturer.setName(rs.getString("name"));
        return manufacturer;
    }
}
