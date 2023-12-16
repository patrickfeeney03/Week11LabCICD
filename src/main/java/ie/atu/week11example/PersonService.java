package ie.atu.week11example;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonService {
    // Placeholder method to save a person (add to Db in the next two weeks)
    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public void savePerson(Person person) {
        personRepository.save(person);
    }

    // Placeholder method to retrieve a person by employeeId
    public Person getPersonByEmployeeId(String employeeId) {
        // fetch data from a database in future lab
        // For simplicity, we return a dummy person here
        //return new Person();
        return personRepository.findByEmployeeId(employeeId);
    }

    public Optional<Person> getPersonByEmail(String email) {
        // fetch data from a database in future lab
        // For simplicity, we return a dummy person here
        //return new Person();
        return personRepository.findByEmail(email);
    }

    public void deletePerson(Long id) {
        personRepository.deleteById(id);
    }

    public void updatePerson(String email, Person updatedPerson) {
        Optional<Person> existingPersonOptional = personRepository.findByEmail(email);

        if (existingPersonOptional.isPresent()) {
            Person existingPerson = existingPersonOptional.get();

            existingPerson.setName(updatedPerson.getName());
            existingPerson.setAge(updatedPerson.getAge());
            existingPerson.setEmail(updatedPerson.getEmail());
            existingPerson.setTitle(updatedPerson.getTitle());
            existingPerson.setEmployeeId(updatedPerson.getEmployeeId());
            existingPerson.setPosition(updatedPerson.getPosition());
            existingPerson.setDepartment(updatedPerson.getDepartment());
            personRepository.save(existingPerson);
        } else {
            // Print to console
            System.out.println("Person with email " + email + " does not exist");
        }


    }
}
