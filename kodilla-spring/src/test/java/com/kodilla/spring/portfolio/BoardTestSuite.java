package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);

        Board board = context.getBean(Board.class);

        board.getToDoList().addTask("Task toDo1");
        board.getInProgressList().addTask("Task inProgress1");
        board.getDoneList().addTask("Task done1");
        //When
        String taskToDo = board.getToDoList().getTasks().get(0);
        String taskInProgress = board.getInProgressList().getTasks().get(0);
        String taskDone = board.getDoneList().getTasks().get(0);
        //Then
        System.out.println(taskToDo);
        System.out.println( taskInProgress);
        System.out.println(taskDone);
        Assert.assertEquals("Task toDo1", taskToDo);
        Assert.assertEquals("Task inProgress1", taskInProgress);
        Assert.assertEquals("Task done1", taskDone);
    }
}

