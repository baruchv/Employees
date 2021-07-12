package com.employees.springboot.dtos;

import com.employees.springboot.entities.embeddables.Spouse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SpouseDto {
      
    public SpouseDto(Spouse spouse){
        
        this.identityNumber = spouse.getIdentityNumber();
        this.firstName = spouse.getFirstName();
        this.surname = spouse.getSurname();
        this.age = spouse.getAge();
        this.city = spouse.getCity();
        this.street = spouse.getStreet();
        this.houseNumber = spouse.getHouseNumber();
        this.mobilePhoneNumber = spouse.getMobilePhoneNumber();
        this.email = spouse.getEmail();
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
