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

import com.employees.springboot.entities.embeddables.ContactDetails;
import com.employees.springboot.entities.embeddables.FamilyMember;
import com.employees.springboot.entities.embeddables.PrivateDetails;

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

    @Embedded
    private PrivateDetails privateDetails;
    
    @Embedded
    private ContactDetails contactDetails;

    @Embedded
    @ToString.Exclude
    @AttributeOverrides(
        {
            @AttributeOverride( name = "firstName", column = @Column(name = "relative_first_name")),
            @AttributeOverride( name = "age", column = @Column(name = "relative_age")),
            @AttributeOverride( name = "relation", column = @Column(name = "relation"))
        }
    )
    private List<FamilyMember> familyMembers;

}
