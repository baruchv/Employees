package com.employees.springboot.entities.embeddables;

import javax.validation.constraints.Pattern;
import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString   
public class PrivateDetails {
    
    @Column(name="identity_number", unique = true)
    @Pattern(regexp = "^\\d{9}$", message = "Valid ID has exactly 9 digits")
    private int identityNumber;

    @Column(name = "first_name", nullable = false)
    @Pattern(regexp = "\\D{2,}", message = "First name should be longer than 1 charachter")
    private String firstName;

    @Column(name = "surname", nullable = false)
    @Pattern(regexp = "\\D{2,}", message = "Surname should be longer than 1 charachter")
    private String surname;

    @Column(name = "age", nullable = false)
    private int age;
}
