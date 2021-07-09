package com.employees.springboot.entities.embeddables;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ContactDetails {
    
    @Column(name = "city", nullable = false)
    @Pattern(regexp = "\\D{2,}", message = "City name should be longer than 1 charachter, and contain only letters")
    @ApiModelProperty(notes = "City field must be longer than 1 charachter, and contains only letters")
    private String city;
    
    @Column(name = "street", nullable = false)
    @Pattern(regexp = "\\D{2,}", message = "Street name should be longer than 1 charachter")
    @ApiModelProperty(notes = "Street field must be longer than 1 charachter, and contains only letters")
    private String street;

    @Column(name = "house_number", nullable = false)
    private int houseNumber;

    @Column(name = "mobile_phone_number", nullable = false, unique = true)
    @Pattern(regexp = "\\d{10}", message = "A valid phone number contains excactly 10 digits")
    @ApiModelProperty(notes =  "A valid phone number contains excactly 10 digits")
    private String mobilePhoneNumber;

    @Column(name = "email", nullable = false)
    @Email(message = "Email address should be valid")
    private String email;

}
