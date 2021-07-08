package com.employees.springboot.entities.employee;

import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.employees.springboot.entities.embeddables.Address;
import com.employees.springboot.entities.embeddables.FamilyMember;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="employees")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {
    
    @Id
    @GeneratedValue
    @Column(name="id")
    private int empId;

    @Column(name="identity_number", unique = true)
    private int identityNumber;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "surname", nullable = false)
    private String surname;

    @Column(name = "age", nullable = false)
    private int age;
    
    @Column(name = "phone_number", nullable = false, unique = true)
    private String phoneNumber;

    @Embedded
    private Address address;

    @Embedded
    @AttributeOverrides(
        {
            @AttributeOverride( name = "firstName", column = @Column(name = "spouse_first_name")),
            @AttributeOverride( name = "age", column = @Column(name = "spouse_age"))
        }
    )
    private FamilyMember spouse;

    @Embedded
    private List<FamilyMember> children;

    

}
