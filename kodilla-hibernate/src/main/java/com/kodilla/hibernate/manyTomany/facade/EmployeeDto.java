package com.kodilla.hibernate.manyTomany.facade;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDto {
    private final List<CompanyDto> companies = new ArrayList<>();

    public void addCompany(CompanyDto companyDto) {
        companies.add(companyDto);
    }

    public List<CompanyDto> getCompanies() {
        return companies;
    }
}
