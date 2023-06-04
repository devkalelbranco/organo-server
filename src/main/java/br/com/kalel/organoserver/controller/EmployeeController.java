package br.com.kalel.organoserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.kalel.organoserver.models.Employee;
import br.com.kalel.organoserver.models.Team;
import br.com.kalel.organoserver.repository.EmployeeRepository;
import br.com.kalel.organoserver.repository.TeamRepository;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    
    private final EmployeeRepository repository;
    private final TeamRepository teamRepository;

    public EmployeeController(EmployeeRepository repository, TeamRepository teamRepository){
        this.repository = repository;
        this.teamRepository = teamRepository;
    }

    @GetMapping("")
    public Iterable<Employee> employess() {
        return this.repository.findAll();
    }
    
    @PostMapping()
    public Employee storeEmployee(@RequestBody Employee employee){
        return this.repository.save(employee);
    }

}
