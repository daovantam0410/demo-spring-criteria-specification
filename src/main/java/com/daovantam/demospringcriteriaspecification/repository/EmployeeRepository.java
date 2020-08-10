package com.daovantam.demospringcriteriaspecification.repository;

import com.daovantam.demospringcriteriaspecification.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer>, JpaSpecificationExecutor<EmployeeEntity> {

}
