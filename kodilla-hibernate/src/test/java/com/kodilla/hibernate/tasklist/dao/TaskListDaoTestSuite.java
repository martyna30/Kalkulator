package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.task.TaskFinancialDetails;
import com.kodilla.hibernate.task.dao.TaskDao;
import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    @Autowired
    private TaskDao taskDao;

    private static final String DESCRIPTION = "This is the shopping list for this week";
    private static final String LISTNAME = "ToDoList";

    @Test
    public void testSaveTaskList() {
        //Given
        TaskList taskList = new TaskList(LISTNAME, DESCRIPTION);

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
        Assert.assertEquals(1, listOftask.size());

        //CleanUp
        int id = listOftask.get(0).getId();
        taskListDao.deleteById(id);
    }

    @Test
    public void testTaskListDaoSaveWithTasks() {
        //Given
        Task task = new Task("Test: Learn Hibernate", 14);
        Task task2 = new Task("Test: Write some entities", 3);
        TaskFinancialDetails tfd = new TaskFinancialDetails(new BigDecimal(20), false);
        TaskFinancialDetails tfd2 = new TaskFinancialDetails(new BigDecimal(10), false);
        task.setTaskFinancialDetails(tfd);
        task2.setTaskFinancialDetails(tfd2);
        TaskList taskList = new TaskList(LISTNAME, "ToDo tasks");
        taskList.getTasks().add(task);
        taskList.getTasks().add(task2);
        task.setTaskList(taskList);
        task2.setTaskList(taskList);

        //When
        taskListDao.save(taskList);//zapisanie listy do bazy
        int id = taskList.getId();

        //Then
        Assert.assertNotEquals(0, id);

        //CleanUp
        taskListDao.deleteById(id);
    }

    @Test
    public void testNamedQueries() {
        //Given
        Task task1 = new Task("Test: Study Hibernate", 3);
        Task task2 = new Task("Test: Practice Named Queries", 6);
        Task task3 = new Task("Test: Study native queries", 7);
        Task task4 = new Task("Test: Make some tests", 13);

        TaskFinancialDetails tfd1 = new TaskFinancialDetails(new BigDecimal(5), false);
        TaskFinancialDetails tfd2 = new TaskFinancialDetails(new BigDecimal(10), false);
        TaskFinancialDetails tfd3 = new TaskFinancialDetails(new BigDecimal(20), false);
        TaskFinancialDetails tfd4 = new TaskFinancialDetails(new BigDecimal(15), false);

        task1.setTaskFinancialDetails(tfd1);
        task2.setTaskFinancialDetails(tfd2);
        task3.setTaskFinancialDetails(tfd3);
        task4.setTaskFinancialDetails(tfd4);

        TaskList taskList = new TaskList(LISTNAME, "ToDo tasks");

        taskList.getTasks().add(task1);
        taskList.getTasks().add(task2);
        taskList.getTasks().add(task3);
        taskList.getTasks().add(task4);

        task1.setTaskList(taskList);
        task2.setTaskList(taskList);
        task3.setTaskList(taskList);
        task4.setTaskList(taskList);

        taskListDao.save(taskList);
        int id = taskList.getId();

        Assert.assertNotEquals(0, id);

        //When
        List<Task> longTasks = taskDao.retrieveLongTasks();
        List<Task> shortTasks = taskDao.retrieveShortTasks();
        List<Task> enoughTimeTask = taskDao.retrieveTasksWithEnoughTime();
        List<Task> durationLongerThanTasks = taskDao.retrieveTasksWithDurationLongerThan(6);
        //Then
        try {
            Assert.assertEquals(1, longTasks.size());
            Assert.assertEquals(3, shortTasks.size());
            Assert.assertEquals(3, enoughTimeTask.size());
            Assert.assertEquals(2, durationLongerThanTasks.size());
        } finally {
            //CleanUp
            taskListDao.deleteById(id);
        }
    }
}

