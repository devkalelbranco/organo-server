package br.com.kalel.organoserver.controller;

import java.util.UUID;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.kalel.organoserver.models.Employee;
import br.com.kalel.organoserver.repository.EmployeeRepository;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    
    private final EmployeeRepository repository;

    public EmployeeController(EmployeeRepository repository){
        this.repository = repository;
    }

    @GetMapping("")
    public Iterable<Employee> employess() {
        return this.repository.findAll();
    }
    
    @PostMapping("")
    public Employee storeEmployee(@RequestBody Employee employee){
        return this.repository.save(employee);
    }

    @DeleteMapping("")
    public void removeEmployee(@PathVariable UUID id){
        this.repository.delete(this.repository.findById(id).get());
    }

}
