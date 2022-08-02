package web.Service;

import org.springframework.transaction.annotation.Transactional;
import web.DAO.PersonDAO;
import web.Model.Person;

import java.util.List;

public class PersonServiceImpl implements PersonService {
    private PersonDAO personDAO;
    @Override
    @Transactional
    public List<Person> index(){
        return index();
    }
    @Override
    @Transactional
    public Person show(int id){
        return show(id);
    }
    @Override
    @Transactional
    public void save(Person person){
        personDAO.save(person);
    }
    @Override
    @Transactional
    public void update(int id, Person updatePerson){
        personDAO.update(id, updatePerson);
    }
    @Override
    @Transactional
    public void delete(int id){
        personDAO.delete(id);
    }
}
