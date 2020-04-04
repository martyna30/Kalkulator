package com.kodilla.hibernate.manyTomany.dao;

import com.kodilla.hibernate.manyTomany.Company;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional//interfejs powinien być użyty do utworzenia Beana(Component)
@Repository
public interface CompanyDao extends CrudRepository<Company, Integer> {
 @Query(nativeQuery = true)
    List<Company> retrieveCompanyWithName();

}
