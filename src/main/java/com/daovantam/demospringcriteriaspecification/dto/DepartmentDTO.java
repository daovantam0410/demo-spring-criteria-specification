package com.daovantam.demospringcriteriaspecification.dto;

public class DepartmentDTO extends AbstractDTO<DepartmentDTO> {
    private String departmentName;

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
