package com.daovantam.demospringcriteriaspecification.repository.specification;

import com.daovantam.demospringcriteriaspecification.entity.DepartmentEntity;
import org.springframework.data.jpa.domain.Specification;

public class DepartmentSpecification {

    public static Specification<DepartmentEntity> hasId(Integer id) {
        if (id == null) return null;
        return (root, criteriaQuery, criteriaBuilder) -> criteriaBuilder.equal(root.get("id"), id);
    }

    public static Specification<DepartmentEntity> hasName(String departmentName) {
        if (departmentName == null) return null;
        return (root, criteriaQuery, criteriaBuilder) -> criteriaBuilder.like(root.get("departmentName"), "%" + departmentName + "%");
    }
}
