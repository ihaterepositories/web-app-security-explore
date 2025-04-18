package web.security.laba1.person;

/*
    @author boguc
    @project laba1
    @class PersonController
    @version 1.0.0
    @since 24.02.2025 - 15.22
*/

import lombok.AllArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/persons")
@AllArgsConstructor
public class PersonRestController {
    private final PersonService service;

    @GetMapping
    public List<Person> getPersons() {
        return service.getAll();
    }

    @GetMapping("/getById/{id}")
    public Person getPerson(@PathVariable String id) {
        return service.getById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deletePerson(@PathVariable String id) {
        service.deleteById(id);
    }

    @PostMapping("/post")
    public Person createPerson(@RequestBody Person person) {
        return service.create(person);
    }

    @PutMapping("/update")
    public Person updatePerson(@RequestBody Person person) {
        return service.update(person);
    }

    @GetMapping("/user")
    @PreAuthorize("hasRole('USER')")
    public String helloUser() {
        return "Hello User!";
    }

    @GetMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    public String helloAdmin() {
        return "Hello Admin!";
    }

    @GetMapping("/unknown")
    @PreAuthorize("hasAnyRole('USER', 'ADMIN', 'UNKNOWN')")
    public String helloUnknown() {
        return "Hello Unknown!";
    }

    @GetMapping("/stranger")
    public String helloStranger() {
        return "Hello stranger!";
    }
}
