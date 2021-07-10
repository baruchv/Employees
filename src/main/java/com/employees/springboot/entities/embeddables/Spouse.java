package com.employees.springboot.entities.embeddables;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Spouse {
    
    @Embedded
    @AttributeOverrides(
        {
            @AttributeOverride(name = "identityNumber", column = @Column(name = "spouse_id")),
            @AttributeOverride(name = "firstName", column = @Column(name = "spouse_first_name")),
            @AttributeOverride(name = "surname", column = @Column(name = "spouse_surname")),
            @AttributeOverride(name = "age", column = @Column(name = "spouse_age"))
        }
    )
    private PrivateDetails privateDetails;

    @Embedded
    @AttributeOverrides(
        {
            @AttributeOverride(name = "city", column = @Column(name = "spouse_city")),
            @AttributeOverride(name = "street", column = @Column(name = "spouse_street")),
            @AttributeOverride(name = "houseNumber", column = @Column(name = "spouse_house_number")),
            @AttributeOverride(name = "mobilePhoneNumber", column = @Column(name = "spouse_mobile_phone_number")),
            @AttributeOverride(name = "email", column = @Column(name = "spouse_email"))
        }
    )
    private ContactDetails contactDetails;
}

