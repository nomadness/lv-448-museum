package academy.softserve.museum.dao.impl.jdbc.mappers;

import academy.softserve.museum.entities.Employee;
import academy.softserve.museum.entities.EmployeePosition;
import academy.softserve.museum.entities.Excursion;
import academy.softserve.museum.entities.Timetable;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TimetableRowMapper implements RowMapper<Timetable> {
    @Override
    public Timetable mapRow(ResultSet resultSet) {
        Timetable timetable = new Timetable();
        Employee employee = new Employee();
        Excursion excursion = new Excursion();

        try{
            timetable.setId(resultSet.getLong("timetable_id"));
            timetable.setDateStart(resultSet.getDate("date_start"));
            timetable.setDateEnd(resultSet.getDate("date_end"));

            employee.setId(resultSet.getLong("employee_id"));
            employee.setFirstName(resultSet.getString("first_name"));
            employee.setLastName(resultSet.getString("last_name"));
            employee.setPosition(EmployeePosition.valueOf(resultSet.getString("position")));
            employee.setPassword(resultSet.getString("password"));
            employee.setLogin("login");
            timetable.setEmployee(employee);

            excursion.setId(resultSet.getLong("excursion_id"));
            excursion.setName(resultSet.getString("excursion_name"));
            timetable.setExcursion(excursion);

            return timetable;
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

}
