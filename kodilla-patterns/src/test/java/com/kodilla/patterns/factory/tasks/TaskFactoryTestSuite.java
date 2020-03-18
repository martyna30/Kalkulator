package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void getTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        Task drivingTask = taskFactory.makeTask(TaskFactory.DRIVING_TASK);
        Task shoppingTask = taskFactory.makeTask(TaskFactory.SHOPPING_TASK);
        Task paintingTask = taskFactory.makeTask(TaskFactory.PAINTING_TASK);

        //When
        boolean executeDrivingTask = drivingTask.executeTask();
        boolean drivingTaskExecuted= drivingTask.isTaskExecuted();
        String drivingTaskTaskName = drivingTask.getTaskName();

        boolean executeShoppingTask = shoppingTask.executeTask();
        boolean shoppingTaskExecuted = shoppingTask.isTaskExecuted();
        String shoppingTaskName = shoppingTask.getTaskName();

        boolean executePaintingTask = paintingTask.executeTask();
        boolean paintingTaskExecuted = paintingTask.isTaskExecuted();
        String paintingTaskName = paintingTask.getTaskName();

        //Then
        Assert.assertTrue(executeDrivingTask);
        Assert.assertTrue(drivingTaskExecuted);
        Assert.assertEquals("Driving test", drivingTaskTaskName);

        Assert.assertFalse(executeShoppingTask);
        Assert.assertFalse(shoppingTaskExecuted);
        Assert.assertEquals("Holiday shopping", shoppingTaskName);

        Assert.assertFalse(executePaintingTask);
        Assert.assertFalse(paintingTaskExecuted);
        Assert.assertEquals("House painting", paintingTaskName);

    }
}
