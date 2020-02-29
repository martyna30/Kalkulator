package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {
    @Autowired
    private TaskList toDoList;
    @Autowired
    private TaskList inProgressList;
    @Autowired
    private TaskList doneList;
    @Bean
    public Board getBoardList() {
        return new Board(toDoList, inProgressList, doneList);
    }
    @Bean(name = "toDoList")
        public TaskList getToDo() {
            return new TaskList();
    }
    @Bean(name = "inProgressList")
    public TaskList getInProgress() {
        return new TaskList();
    }
    @Bean(name = "doneList")
    public TaskList getDone() {
        return new TaskList();
    }
}











