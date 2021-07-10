package com.employees.springboot.entities.embeddables;

import javax.validation.constraints.Pattern;
import javax.persistence.Column;
import javax.persistence.Embeddable;


import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Data  
public class PrivateDetails {
    
    @Column(name="identity_number", unique = true)
    @Pattern(regexp = "^\\d{9}$", message = "Valid ID has exactly 9 digits")
    @ApiModelProperty(notes = "Valid ID has exactly 9 digits")
    private int identityNumber;

    @Column(name = "first_name", nullable = false)
    @Pattern(regexp = "\\D{2,}", message = "First name should be longer than 1 charachter")
    @ApiModelProperty(notes = "First name must be longer than 1 charachter and contain only letters")
    private String firstName;

    @Column(name = "surname", nullable = false)
    @Pattern(regexp = "\\D{2,}", message = "Surname should be longer than 1 charachter")
    @ApiModelProperty(notes = "Surname must be longer than 1 charachter and contain only letters")
    private String surname;

    @Column(name = "age", nullable = false)
    private int age;
}
