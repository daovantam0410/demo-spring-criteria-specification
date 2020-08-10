package com.daovantam.demospringcriteriaspecification.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employee")
public class EmployeeEntity extends BaseEntity {

    @Column(name = "fullname")
    private String fullName;

    @Column(name = "age")
    private int age;

    @Column(name = "address")
    private String address;

    @Column(name = "gender")
    private String gender;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private DepartmentEntity departmentEntity;

}
