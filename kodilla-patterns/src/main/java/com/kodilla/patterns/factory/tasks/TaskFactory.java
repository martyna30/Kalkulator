package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String DRIVING_TASK = "Driving Task";
    public static final String PAINTING_TASK = "Painting Task";
    public static final String SHOPPING_TASK = "Shopping Task";

    public Task makeTask(final String taskClass) {
        switch (taskClass) {
            case DRIVING_TASK:
                return new DrivingTask("Driving test", "Driving school", "Mercedes");
            case PAINTING_TASK:
                return new PaintingTask("House painting", "", "House");

            case SHOPPING_TASK:
                return new ShoppingTask("Holiday shopping", "diving equipment", 2);
            default:
                return null;
        }


    }
}
















