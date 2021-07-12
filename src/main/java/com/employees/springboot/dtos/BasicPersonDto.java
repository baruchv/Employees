package com.employees.springboot.dtos;

import com.employees.springboot.entities.embeddables.PrivateDetails;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BasicPersonDto {
    
    public BasicPersonDto(PrivateDetails details){
        this.identityNumber = details.getIdentityNumber();
        this.firstName = details.getFirstName();
        this.surname = details.getSurname();
    }
    
    private int identityNumber;

    private String firstName;

    private String surname;
}
