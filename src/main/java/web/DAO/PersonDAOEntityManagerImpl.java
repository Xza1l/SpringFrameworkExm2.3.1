package web.DAO;

import org.springframework.stereotype.Repository;
import web.Model.Person;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PersonDAOEntityManagerImpl implements PersonDAO {
    private List<Person> people;

    {
        people = new ArrayList<>();
    }

    public List<Person> index() {
        return people;
    }

    public Person show(int id) {
        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }

    public void save(Person person) {
        person.setId(person.getId());
        people.add(person);
    }

    public void update(int id, Person updatedPerson) {
        Person personToBeUpdated = show(id);

        personToBeUpdated.setName(updatedPerson.getName());
    }

    public void delete(int id) {
        people.removeIf(p -> p.getId() == id);
    }
}
