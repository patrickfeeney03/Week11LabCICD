package ie.atu.week11example;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PersonRepository extends JpaRepository<Person, Long> {
    Person findByEmployeeId(String employeeId);
    //Person findByEmail(String email);
    //Person deleteById(Long employeeId);

    Optional<Person> findByEmail(String email);
}
