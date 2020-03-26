package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TaskListDao extends CrudRepository<TaskList, Integer> { //kontroler repozytorium -klasy bądź interfejsy, które posiadają określone metody służące
    // do oddelegowania różnych działań do właściwych miejsc w aplikacji -repozytorum dostarcza nam metody
    List<TaskList> findByListName(String listName);
}

