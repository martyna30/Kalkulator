package com.kodilla.hibernate.manyTomany.dao;

import com.kodilla.hibernate.manyTomany.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Transactional
@Repository
public interface EmployeeDao extends CrudRepository<Employee, Integer> {
    @Query
    List<Employee> retrieveEmployeesWithLastName(@Param("LASTNAME")String lastName);

    @Query
    List<Employee> retrieveEmployeesWithStringCharacter(@Param("LASTNAME")String lastname);

}
