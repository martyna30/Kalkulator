package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class TaskList implements Observable {
    private String taskListName;
    private List<String> taskList;
    private List<Observer> observers;

    public TaskList(String taskListName) {
        this.taskListName = taskListName;
        this.taskList = new ArrayList<>();
        this.observers = new ArrayList<>();
    }

    public void addTask(String taskName) {
        this.taskList.add(taskName);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);

    }

    public List<String> getTaskList() {
        return taskList;
    }

    public String getTaskListName() {
        return taskListName;
    }
}






