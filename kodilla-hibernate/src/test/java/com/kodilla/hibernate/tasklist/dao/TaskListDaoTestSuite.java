package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String DESCRIPTION = "This is the shopping list for this week";

    @Test
    public void testSaveTaskList() {
        //Given
        TaskList taskList = new TaskList("", DESCRIPTION);

        //When
        taskListDao.save(taskList);

        //Then
        int idTaskList = taskList.getId();
        Optional<TaskList> readTaskList = taskListDao.findById(idTaskList);//tabela z tasklist
        Assert.assertTrue(readTaskList.isPresent());

        //CleanUP
        taskListDao.deleteById(idTaskList);
    }


    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList("Shopping list", DESCRIPTION);
        taskListDao.save(taskList);
        String nameOfList = taskList.getListName();

        //When

        List<TaskList> listOftask = taskListDao.findByListName(nameOfList);
       //Then
        Assert.assertEquals(1,listOftask.size());

        //CleanUp
        int id = listOftask.get(0).getId();
        taskListDao.deleteById(id);
    }
}
