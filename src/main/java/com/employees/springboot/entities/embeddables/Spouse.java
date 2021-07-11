package com.employees.springboot.entities.embeddables;

import javax.persistence.Embeddable;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Spouse {
    
    @Pattern(regexp = "^\\d{9}$", message = "Valid ID has exactly 9 digits")
    @ApiModelProperty(notes = "Valid ID has exactly 9 digits")
    private int identityNumber;

    @Pattern(regexp = "\\D{2,}", message = "First name should be longer than 1 charachter")
    @ApiModelProperty(notes = "First name must be longer than 1 charachter and contain only letters")
    private String firstName;

    @Pattern(regexp = "\\D{2,}", message = "Surname should be longer than 1 charachter")
    @ApiModelProperty(notes = "Surname must be longer than 1 charachter and contain only letters")
    private String surname;

    @PositiveOrZero
    @ApiModelProperty(notes = "Age cannot be negative")
    private int age;

    @Pattern(regexp = "\\D{2,}", message = "City name should be longer than 1 charachter, and contain only letters")
    @ApiModelProperty(notes = "City field must be longer than 1 charachter, and contains only letters")
    private String city;
    
    @Pattern(regexp = "\\D{2,}", message = "Street name should be longer than 1 charachter")
    @ApiModelProperty(notes = "Street field must be longer than 1 charachter, and contains only letters")
    private String street;

    @Positive
    @ApiModelProperty(notes = "Age should be positive")
    private int houseNumber;

    @Pattern(regexp = "\\d{10}", message = "A valid phone number contains excactly 10 digits")
    @ApiModelProperty(notes =  "A valid phone number contains excactly 10 digits")
    private String mobilePhoneNumber;

    @Email(message = "Email address should be valid")
    private String email;

    
}

