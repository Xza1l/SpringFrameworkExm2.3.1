package web.DAO;

import web.Model.Person;

import java.util.List;

public interface PersonDAO {
    List<Person> index();
    Person show(int id);
    void save(Person person);
    void update(int id, Person updatePerson);
    void delete(int id);
}
