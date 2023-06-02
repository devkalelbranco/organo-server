package br.com.kalel.organoserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
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

}
