package com.kodilla.hibernate.manyTomany.facade;

import java.util.ArrayList;
import java.util.List;

public class CompanyDto {
    private final List<EmployeeDto> employees = new ArrayList<>();

    public void addEmployee(EmployeeDto employeeDto) {
        employees.add(employeeDto);
    }

    public List<EmployeeDto> getEmployees() {
        return employees;
    }

}
