package com.kodilla.hibernate.task.dao;

import com.kodilla.hibernate.task.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Transactional
// Adnotacja @Transactional może być użyta przy konkretnej metodzie lub przy klasie (albo interfejsie) - wówczas oznacza to, że dotyczy ona wszystkich metod udostępnianych przez klasę (lub interfejs).
// dba o zatwierdzanie i wycofywanie transakcji bazodanowych (COMMIT oraz ROLLBACK wykonywane są przez Springa).
@Repository//springowa adnotacja ,interfejs powinien byc użyty do utworzenia beana ktory bedzie kontrolerem repozytoriun
public interface TaskDao extends CrudRepository<Task, Integer> {//klasa ktore obiekty zapisujemy do bazy,oraz typ klucza
List<Task> findByDuration(int duration);
}
