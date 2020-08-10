package com.daovantam.demospringcriteriaspecification.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "department")
public class DepartmentEntity extends BaseEntity {

    @Column(name = "departmentname")
    private String departmentName;

    @OneToMany(mappedBy = "departmentEntity")
    private List<EmployeeEntity> employeeEntityList = new ArrayList<>();

}
