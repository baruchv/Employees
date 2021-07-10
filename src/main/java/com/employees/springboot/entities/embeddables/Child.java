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
public class Child {
    @Embedded
    @AttributeOverrides(
        {
            @AttributeOverride(name = "identityNumber", column = @Column(name = "child_id")),
            @AttributeOverride(name = "firstName", column = @Column(name = "child_first_name")),
            @AttributeOverride(name = "surname", column = @Column(name = "child_first_name")),
            @AttributeOverride(name = "age", column = @Column(name = "child_age"))
        }
    )
    private PrivateDetails details;
}
