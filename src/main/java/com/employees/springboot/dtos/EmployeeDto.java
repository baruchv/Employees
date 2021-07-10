package com.employees.springboot.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmployeeDto {
    
    private int identityNumber;

    private String firstName;

    private String surname;

    private int age;
    
    private String city;

    private String street;

    private int houseNumber;

}
