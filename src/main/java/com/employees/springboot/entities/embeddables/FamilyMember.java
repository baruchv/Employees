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
public class FamilyMember {
    
    @Column(name = "first_name", nullable = false)
    private String firstName;

    /* age attribute should be an Integer rather than primitive int,
       since an employee not necessarily has family members,
       the embedded field might be nullable
    */
    @Column(name = "age", nullable = false)
    private Integer age;
}

