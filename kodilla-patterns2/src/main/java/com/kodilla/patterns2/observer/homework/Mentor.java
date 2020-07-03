package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private String name;
    private int count;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void update(TaskList taskList) {
        System.out.println(name + ": New tasks in taskList " + taskList.getTaskListName() + "\n" +
                "Total of: " + taskList.getTaskList().size() + " tasks");
        count++;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }
}
