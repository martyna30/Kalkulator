package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manyTomany.facade.CompanyDto;
import com.kodilla.hibernate.manyTomany.facade.EmployeeDto;
import com.kodilla.hibernate.manyTomany.facade.Facade;
import com.kodilla.hibernate.manyTomany.facade.ProcessSearchException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class NameWithStringCharacterTestSuite {

    @Autowired
    Facade facade;

    @Test
    public void testRetrieveCompanyNameWithStringCharacter() throws ProcessSearchException {
        CompanyDto companyDto = new CompanyDto();
        try {
            facade.processSearchCompany(companyDto);
        }
        catch(ProcessSearchException e) {
            e.getMessage();
        }
    }

    @Test
    public void testRetrieveEmployeeWithStringCharacter() throws ProcessSearchException {
        EmployeeDto employeeDto = new EmployeeDto();
        try {
            facade.processSearchEmployee(employeeDto);
        }
        catch(ProcessSearchException e) {
            e.getMessage();
        }
    }
}
