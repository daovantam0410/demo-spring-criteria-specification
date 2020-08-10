package com.daovantam.demospringcriteriaspecification.service.impl;


import com.daovantam.demospringcriteriaspecification.converter.EmployeeConverter;
import com.daovantam.demospringcriteriaspecification.dto.EmployeeDTO;
import com.daovantam.demospringcriteriaspecification.entity.EmployeeEntity;
import com.daovantam.demospringcriteriaspecification.repository.DepartmentRepository;
import com.daovantam.demospringcriteriaspecification.repository.EmployeeRepository;
import com.daovantam.demospringcriteriaspecification.repository.specification.EmployeeSpecification;
import com.daovantam.demospringcriteriaspecification.service.IEmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

    private EmployeeRepository employeeRepository;

    private DepartmentRepository departmentRepository;

    private EmployeeConverter employeeConverter;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository,
                               EmployeeConverter employeeConverter,
                               DepartmentRepository departmentRepository) {
        this.employeeRepository = employeeRepository;
        this.employeeConverter = employeeConverter;
        this.departmentRepository = departmentRepository;
    }

    @Override
    public List<EmployeeDTO> findAll() {
        List<EmployeeEntity> list = employeeRepository.findAll();
        List<EmployeeDTO> dtoList = list.stream()
                .map(employeeConverter::toDTO)
                .collect(Collectors.toList());
        return dtoList;
    }

    @Override
    public List<EmployeeDTO> findAllByIdAndAge(EmployeeDTO employeeDTO) {
        List<EmployeeEntity> list = employeeRepository.findAll(EmployeeSpecification.filter1(employeeDTO));
        return list
                .stream()
                .map(employeeEntity -> employeeConverter.toDTO(employeeEntity))
                .collect(Collectors.toList());
    }

    @Override
    public List<EmployeeDTO> findAllByAddressAndGender(EmployeeDTO employeeDTO) {
        List<EmployeeEntity> list = employeeRepository.findAll(EmployeeSpecification.filter2(employeeDTO));
        return list
                .stream()
                .map(employeeEntity -> employeeConverter.toDTO(employeeEntity))
                .collect(Collectors.toList());
    }


}
