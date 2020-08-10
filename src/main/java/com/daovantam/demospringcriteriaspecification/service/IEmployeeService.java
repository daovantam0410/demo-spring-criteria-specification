package com.daovantam.demospringcriteriaspecification.service;

import com.daovantam.demospringcriteriaspecification.dto.EmployeeDTO;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface IEmployeeService {


    List<EmployeeDTO> findAll();

    List<EmployeeDTO> findAllByIdAndAge(EmployeeDTO employeeDTO);

    List<EmployeeDTO> findAllByAddressAndGender(EmployeeDTO employeeDTO);
}
