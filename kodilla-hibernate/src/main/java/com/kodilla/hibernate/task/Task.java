package com.kodilla.hibernate.task;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity //UTRWALENIE W BAZIE(informacja że obiektu mają być w bazie, a tabele utworzy sam i nazwie sam)
@Table(name = "tasks") //opcjonale WSKAZANIE nazwy TABELI dla obiektów
public class Task {
    private int id;
    private String description;
    private Date created;
    private int duration;

    public Task() { } //do odtworzenia obiektow z bazy wykorzystywany jest konstruktor bezparametrowy

    public Task (String description, int duration) {
        this.description = description;
        this.created = new Date();
        this.duration = duration;
    }

    @Id
    @GeneratedValue  //sam generuje wartości
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }

    @Column (name="DESCRIPTION")
    public String getDescription() {
        return description;
    }

    @NotNull
    @Column(name="CREATED")
    public Date getCreated() {
        return created;
    }

    @Column(name="DURATION")
    public int getDuration() {
        return duration;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
