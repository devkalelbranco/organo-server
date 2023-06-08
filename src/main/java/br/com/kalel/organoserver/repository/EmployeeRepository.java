package br.com.kalel.organoserver.repository;


import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import br.com.kalel.organoserver.models.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, UUID> {

}
