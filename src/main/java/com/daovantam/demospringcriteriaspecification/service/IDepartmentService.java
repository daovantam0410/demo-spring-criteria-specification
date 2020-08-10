package com.daovantam.demospringcriteriaspecification.service;


import com.daovantam.demospringcriteriaspecification.dto.DepartmentDTO;

import java.util.List;

public interface IDepartmentService {

    List<DepartmentDTO> getAll();

    DepartmentDTO getDepartmentById(Integer id);

}
