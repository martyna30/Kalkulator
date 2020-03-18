package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {
    private final String taskName;
    private final String where;
    private final String using;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public boolean executeTask() {
        if(using.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public boolean isTaskExecuted() {
        if(executeTask()){
            System.out.println("Task completed");
            return true;
        } else {
            System.out.println("Lack of a car");
            return false;
        }
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public String toString() {
        return "DrivingTask{" +
                "taskName='" + taskName + '\'' +
                ", where='" + where + '\'' +
                ", using='" + using + '\'' +
                '}';
    }
}
