package academy.softserve.museum.dao.impl.jdbc;

import academy.softserve.museum.dao.ExhibitDao;
import academy.softserve.museum.entities.Audience;
import academy.softserve.museum.entities.Author;
import academy.softserve.museum.entities.Employee;
import academy.softserve.museum.entities.Exhibit;
import academy.softserve.museum.entities.statistic.ExhibitStatistic;

import java.sql.Connection;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class JdbcExhibitDao implements ExhibitDao {
    private Connection connection;

    public JdbcExhibitDao(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<Exhibit> findByAuthor(Author author) {
        return null;
    }

    @Override
    public List<Exhibit> findByEmployee(Employee audienceManager) {
        return null;
    }

    @Override
    public Map<Audience, List<Exhibit>> findAllGroupedByAudience(Audience audience) {
        return null;
    }

    @Override
    public ExhibitStatistic exhibitStatistic() {
        return null;
    }

    @Override
    public void save(Exhibit objectToSave) {

    }

    @Override
    public void deleteById(long id) {

    }

    @Override
    public Optional<Exhibit> findById(long id) {
        return Optional.empty();
    }

    @Override
    public List<Exhibit> findAll() {
        return null;
    }

    @Override
    public void updateById(long id, Exhibit newObject) {

    }
}