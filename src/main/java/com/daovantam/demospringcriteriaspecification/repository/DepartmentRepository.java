package com.daovantam.demospringcriteriaspecification.repository;

import com.daovantam.demospringcriteriaspecification.entity.DepartmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface DepartmentRepository extends JpaRepository<DepartmentEntity, Integer>, JpaSpecificationExecutor<DepartmentEntity> {

}
