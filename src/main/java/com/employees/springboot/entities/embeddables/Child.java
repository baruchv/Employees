package com.employees.springboot.entities.embeddables;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;


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
