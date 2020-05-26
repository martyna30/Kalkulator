package com.kodilla.hibernate.manyTomany.facade;

import com.kodilla.hibernate.manyTomany.Company;
import com.kodilla.hibernate.manyTomany.Employee;
import com.kodilla.hibernate.manyTomany.dao.CompanyDao;
import com.kodilla.hibernate.manyTomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Facade {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;
    private static final Logger LOGGER = LoggerFactory.getLogger(Facade.class);

    public void processSearchCompany(CompanyDto companyDto) throws ProcessSearchException {
        boolean wasError = false;
        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        if(softwareMachineId < 0 && dataMaestersId < 0&& greyMatterId < 0) {
            LOGGER.error(ProcessSearchException.ERR_COMPANY_WRITE_ERROR_TO_DATABASE);
            wasError = true;
            throw new ProcessSearchException(ProcessSearchException.ERR_COMPANY_WRITE_ERROR_TO_DATABASE);
        }
        try {
            List<Company> companyWithStringCharacter = companyDao.retrieveCompanyWithStringCharacter("%Ma%");

            if (companyWithStringCharacter.size() == 0) {
                LOGGER.error(ProcessSearchException.ERR_COMPANY_NOT_FOUND);
                wasError = true;
                throw new ProcessSearchException(ProcessSearchException.ERR_COMPANY_NOT_FOUND);
            }
            LOGGER.info("Company with String character was found");
        }
        finally {
            if(wasError) {
                LOGGER.info("Company with String character wasn't found");
            }
        }
    }

    public void processSearchEmployee(EmployeeDto employeeDto) throws ProcessSearchException {
        boolean wasError = false;
        Employee employee = new Employee("Anna", "Clark");
        Employee employee2 = new Employee("Angelina", "Clinton");
        employeeDao.save(employee);
        int employeeId = employee.getId();
        employeeDao.save(employee2);
        int employee2Id = employee2.getId();

        if (employeeId < 0 && employee2Id < 0) {
            LOGGER.error(ProcessSearchException.ERR_EMPLOYEES_WRITE_ERROR_TO_DATABASE);
            wasError = true;
            throw new ProcessSearchException(ProcessSearchException.ERR_EMPLOYEES_WRITE_ERROR_TO_DATABASE);
        }
        try {
            List<Employee> employeeWithStringCharacter = employeeDao.retrieveEmployeesWithStringCharacter("%Cl%");

            if (employeeWithStringCharacter.isEmpty()) {
                LOGGER.error(ProcessSearchException.ERR_EMPLOYEE_NOT_FOUND);
                wasError = true;
                throw new ProcessSearchException(ProcessSearchException.ERR_EMPLOYEE_NOT_FOUND);
            }
            LOGGER.info("Employee with String character was found");
        } finally {
            if (wasError) {
                LOGGER.info("Employee with String character wasn't found");
            }
        }
    }
}












