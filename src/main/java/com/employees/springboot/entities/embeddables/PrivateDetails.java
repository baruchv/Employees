package com.employees.springboot.entities.embeddables;

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
    private int identityNumber;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "surname", nullable = false)
    private String surname;

    @Column(name = "age", nullable = false)
    private int age;
}
