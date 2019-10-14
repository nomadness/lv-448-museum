package academy.softserve.museum.dao.impl.jdbc.mappers;

import academy.softserve.museum.entities.Excursion;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ExcursionRowMapper implements RowMapper<Excursion> {

    @Override
    public Excursion mapRow(ResultSet resultSet) {
        Excursion excursion = new Excursion();

        try {
            excursion.setId(resultSet.getLong("id"));
            excursion.setName(resultSet.getString("name"));

            return excursion;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}