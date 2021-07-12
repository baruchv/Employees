package com.employees.springboot.repositories;


import java.util.List;

import com.employees.springboot.dtos.BasicPersonDto;
import com.employees.springboot.dtos.EmployeeDto;
import com.employees.springboot.dtos.SpouseDto;
import com.employees.springboot.entities.embeddables.Child;
import com.employees.springboot.entities.embeddables.Spouse;
import com.employees.springboot.entities.employee.Employee;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IEmployeeRepository extends CrudRepository<Employee, Integer> {
    
    @Query("SELECT new com.employees.springboot.dtos.BasicPersonDto(e.privateDetails) FROM Employee e")
    public List<BasicPersonDto> getAllEmployees();

    @Query("SELECT new com.employees.springboot.dtos.EmployeeDto(e.privateDetails, e.contactDetails) FROM Employee e where e.empId = ?1")
    public EmployeeDto getEmployeeById(int empId);

    public Employee findByPrivateDetailsIdentityNumber(int identityNumber);

    @Query("UPDATE Employee e SET e.spouse = ?1")
    public void updateSpouse(Spouse spouse);

    @Query("UPDATE Employee e SET e.children = ?1")
    public void updateChildren(List<Child> children);

    @Query("SELECT new com.employees.springboot.dtos.SpouseDto(e.spouse) from Employee e where e.empId = ?1")
    public SpouseDto getSpouse(int empId);

    
}
