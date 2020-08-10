package com.daovantam.demospringcriteriaspecification.converter;

import com.daovantam.demospringcriteriaspecification.dto.DepartmentDTO;
import com.daovantam.demospringcriteriaspecification.entity.DepartmentEntity;
import org.springframework.stereotype.Component;

@Component
public class DepartmentConverter {

    public DepartmentEntity toEntity(DepartmentDTO departmentDTO) {
        DepartmentEntity departmentEntity = new DepartmentEntity();
        departmentEntity.setId(departmentDTO.getId());
        departmentEntity.setDepartmentName(departmentDTO.getDepartmentName());
        return departmentEntity;
    }

    public DepartmentDTO toDTO(DepartmentEntity departmentEntity) {
        DepartmentDTO departmentDTO = new DepartmentDTO();
        departmentDTO.setId(departmentEntity.getId());
        departmentDTO.setDepartmentName(departmentEntity.getDepartmentName());
        return departmentDTO;
    }

    public DepartmentEntity toEntity(DepartmentDTO departmentDTO, DepartmentEntity departmentEntity) {
        departmentEntity.setDepartmentName(departmentDTO.getDepartmentName());
        return departmentEntity;
    }
}
