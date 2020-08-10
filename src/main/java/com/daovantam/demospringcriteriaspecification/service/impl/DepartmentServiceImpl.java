package com.daovantam.demospringcriteriaspecification.service.impl;

import com.daovantam.demospringcriteriaspecification.converter.DepartmentConverter;
import com.daovantam.demospringcriteriaspecification.dto.DepartmentDTO;
import com.daovantam.demospringcriteriaspecification.entity.DepartmentEntity;
import com.daovantam.demospringcriteriaspecification.repository.DepartmentRepository;
import com.daovantam.demospringcriteriaspecification.service.IDepartmentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DepartmentServiceImpl implements IDepartmentService {

    private DepartmentRepository departmentRepository;

    private DepartmentConverter departmentConverter;

    public DepartmentServiceImpl(DepartmentRepository departmentRepository, DepartmentConverter departmentConverter){
        this.departmentRepository=departmentRepository;
        this.departmentConverter=departmentConverter;
    }

    @Override
    public List<DepartmentDTO> getAll() {
        List<DepartmentEntity> list = departmentRepository.findAll();
        List<DepartmentDTO> dtoList = list.stream()
                                                    .map(departmentConverter::toDTO)
                                                    .collect(Collectors.toList());

        return dtoList;
    }

    @Override
    public DepartmentDTO getDepartmentById(Integer id) {
        DepartmentEntity departmentEntity = departmentRepository.getOne(id);
        return departmentConverter.toDTO(departmentEntity);

    }

}
