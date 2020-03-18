package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {
    private final String taskName;
    private final String color;
    private final String whatToPaint;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public boolean executeTask() {
        if (color != "") {
            return true;
        } else {
            return false;
        }
    }

    public boolean isTaskExecuted() {
        if(executeTask()) {
            System.out.println("Task completed");
            return true;
        } else {
            System.out.println("Lack of materials");
            return false;
        }
    }

    @Override
    public String getTaskName() {
        return taskName;
    }
}
