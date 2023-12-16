package ie.atu.week11example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final PersonRepository personRepository;

    @Autowired
    public DataLoader(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Person testData = new Person(1L, "Paul", 23, "paul@atu.ie", "Mr", "1235", "Lecturer", "Electronics");
        Person testData2 = new Person(2L, "PaAul", 223, "paul@ASD.ie", "Mr", "1235", "LecturerO", "Electronics");
        Person testData3 = new Person(3L, "PSDaul", 123, "paul@atDDDu.ie", "MrA", "1232345", "LASDecturer", "Electronics");
        personRepository.save(testData);
        personRepository.save(testData2);
        personRepository.save(testData3);
    }
}
