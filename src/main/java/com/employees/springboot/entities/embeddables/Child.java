package com.employees.springboot.entities.embeddables;

import javax.persistence.Embeddable;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.PositiveOrZero;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Child {
    
    @Pattern(regexp = "^\\d{9}$", message = "Valid ID has exactly 9 digits")
    private int identityNumber;

    @Pattern(regexp = "\\D{2,}", message = "First name should be longer than 1 charachter")
    private String firstName;

    @Pattern(regexp = "\\D{2,}", message = "Surname should be longer than 1 charachter")
    private String surname;

    @PositiveOrZero
    private int age;
}
