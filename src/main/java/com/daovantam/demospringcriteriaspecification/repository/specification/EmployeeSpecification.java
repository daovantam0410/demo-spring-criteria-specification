package com.daovantam.demospringcriteriaspecification.repository.specification;

import com.daovantam.demospringcriteriaspecification.dto.EmployeeDTO;
import com.daovantam.demospringcriteriaspecification.entity.EmployeeEntity;
import org.springframework.data.jpa.domain.Specification;

public class EmployeeSpecification {

    public static Specification<EmployeeEntity> filter1(EmployeeDTO employeeDTO) {
        return Specification.where(hasId(employeeDTO.getId())).and(hasAge(employeeDTO.getAge()));
    }

    public static Specification<EmployeeEntity> filter2(EmployeeDTO employeeDTO) {
        return Specification.where(hasAddress(employeeDTO.getAddress())).and(hasGender(employeeDTO.getGender()));
    }

    public static Specification<EmployeeEntity> hasId(Integer id) {
        if (id == null) return null;
        return (root, criteriaQuery, criteriaBuilder) -> criteriaBuilder.equal(root.get("id"), id);
    }

    public static Specification<EmployeeEntity> hasFullname(String fullName) {
        if (fullName == null) return null;
        return (root, criteriaQuery, criteriaBuilder) -> criteriaBuilder.like(root.get("fullName"), "%" + fullName + "%");
    }

    public static Specification<EmployeeEntity> hasAge(Integer age) {
        if (age == null) return null;
        return (root, criteriaQuery, criteriaBuilder) -> criteriaBuilder.equal(root.get("age"), age);
    }

    public static Specification<EmployeeEntity> hasAddress(String address) {
        if (address == null) return null;
        return (root, criteriaQuery, criteriaBuilder) -> criteriaBuilder.like(root.get("address"), "%" + address + "%");
    }

    public static Specification<EmployeeEntity> hasGender(String gender) {
        if (gender == null) return null;
        return (root, criteriaQuery, criteriaBuilder) -> criteriaBuilder.like(root.get("gender"), "%" + gender + "%");
    }
}
