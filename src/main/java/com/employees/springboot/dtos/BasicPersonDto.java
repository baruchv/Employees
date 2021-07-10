package com.employees.springboot.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class BasicPersonDto {
    
    private int identityNumber;

    private String firstName;

    private String surname;
}
