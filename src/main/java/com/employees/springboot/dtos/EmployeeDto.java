package com.employees.springboot.dtos;

import com.employees.springboot.entities.embeddables.ContactDetails;
import com.employees.springboot.entities.embeddables.PrivateDetails;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmployeeDto {
    
    
    public EmployeeDto(PrivateDetails privateDetails, ContactDetails contactDetails){
        this.identityNumber = privateDetails.getIdentityNumber();
        this.firstName = privateDetails.getFirstName();
        this.surname = privateDetails.getSurname();
        this.age = privateDetails.getAge();
        this.city = contactDetails.getCity();
        this.street = contactDetails.getStreet();
        this.houseNumber = contactDetails.getHouseNumber();
        this.mobilePhoneNumber = contactDetails.getMobilePhoneNumber();
        this.email = contactDetails.getEmail();
    }

    
    private int identityNumber;

    private String firstName;

    private String surname;

    private int age;
    
    private String city;

    private String street;

    private int houseNumber;

    private String mobilePhoneNumber;

    private String email;

}
