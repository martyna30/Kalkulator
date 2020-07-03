package com.kodilla.patterns2.observer.homework;

import org.junit.Assert;
import org.junit.Test;

public class HomeworkTestSuite {
    @Test
    public void testUpdateTaskList() {
        //Given
        Mentor mentor1 = new Mentor("Jan Nowak");
        Mentor mentor2 = new Mentor("Joanna Kot");

        TaskList taskList1  = new TaskList("Karol's");
        TaskList taskList2  = new TaskList("Anna's");
        TaskList taskList3  = new TaskList("Thomas's");

        taskList1.registerObserver(mentor1);
        taskList1.registerObserver(mentor2);
        taskList2.registerObserver(mentor1);
        taskList3.registerObserver(mentor2);

        //When
        taskList1.addTask("Hibernate task");
        taskList1.addTask("SQL task");
        taskList2.addTask("Spring task");
        taskList3.addTask("Test task");
        taskList3.addTask("Home task");
        //Then
        Assert.assertEquals(3, mentor1.getCount());
        Assert.assertEquals(4, mentor2.getCount());

    }
}
