package com.kodilla.patterns.factory.tasks;

interface Task {
    boolean executeTask();//wykonuje zadanie

    boolean isTaskExecuted();

    String getTaskName();
}
