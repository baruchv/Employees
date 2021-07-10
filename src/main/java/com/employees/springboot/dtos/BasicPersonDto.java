package com.employees.springboot.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BasicPersonDto {
    
    private int identityNumber;

    private String firstName;

    private String surname;
}
