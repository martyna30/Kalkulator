package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {
    private final String taskName;
    private final String whatToBuy;
    private final double quantity;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public boolean executeTask() {
        if(quantity >= 3) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isTaskExecuted() {
        if(executeTask()) {
            return true;
        }
        System.out.println("To little quantity");
        return false;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }
}
