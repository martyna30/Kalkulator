package com.kodilla.hibernate.tasklist;

import com.kodilla.hibernate.task.Task;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "TASKLIST")
public class TaskList {
    private int id;
    private String listName;
    private String  description;
    private List<Task> tasks = new ArrayList<>();

    public TaskList() {}

    public TaskList(String listName, String description) {
        this.listName = listName;
        this.description = description;
    }

    @Id
    @NotNull
    @GeneratedValue
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }

    @Column(name = "LISTNAME")
    public String getListName() {
        return listName;
    }
    @Column(name = "DESCRIPTION")
    public String getDesription() {
        return description;
    }

    @OneToMany(
            targetEntity = Task.class,//prawa strona relacji 1:n
            mappedBy = "taskList",//obiekt po lewej 1 :n
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    public List<Task> getTasks() {
        return tasks;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public void setDesription(String desription) {
        this.description = desription;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
}
