package com.employees.springboot.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ChildDto {
    
    private int identityNumber;

    private String firstName;

    private String surname;

    private int age;
}
