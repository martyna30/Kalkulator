package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manyTomany.Company;
import com.kodilla.hibernate.manyTomany.Employee;
import com.kodilla.hibernate.manyTomany.dao.CompanyDao;
import com.kodilla.hibernate.manyTomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class CompanyDaoTestSuite {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void testSaveManyToMany() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Then
        Assert.assertNotEquals(0, softwareMachineId);
        Assert.assertNotEquals(0, dataMaestersId);
        Assert.assertNotEquals(0, greyMatterId);

        //CleanUp
        try {
            companyDao.deleteById(softwareMachineId);
            companyDao.deleteById(dataMaestersId);
            companyDao.deleteById(greyMatterId);
        } catch (Exception e) {
            //nothing
        }
    }

    @Test
    public void testRetrieveEmployeesWithLastName() {
        //Given
        Employee employee = new Employee("James", "Bond");
        Employee employee2 = new Employee("Angelina", "Smith");

        employeeDao.save(employee);
        employeeDao.save(employee2);

        //When
        List<Employee> employeesWithLastName = employeeDao.retrieveEmployeesWithLastName("Bond");
        int id = employeesWithLastName.get(0).getId();

        //Then
        Assert.assertEquals(1, employeesWithLastName.size());

        //CleanUp
        employeeDao.deleteAll();
    }

    @Test
    public void testRetrieveCompaniesWithName() {
        //Given
        Company company = new Company("Software Machine");
        Company company2 = new Company("Software Development Academy");

        companyDao.save(company);
        companyDao.save(company2);

        //When
        List<Company> companiesWithName = companyDao.retrieveCompanyWithName();
        int id = companiesWithName.get(0).getId();
        int id2 = companiesWithName.get(1).getId();

        //Then
        Assert.assertEquals(2, companiesWithName.size());

        //CleanUp
        companyDao.deleteById(id);
        companyDao.deleteById(id2);
    }
}

