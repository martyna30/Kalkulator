package com.kodilla.patterns.prototype;

import java.util.HashSet;
import java.util.Set;

public final class Board extends Prototype {
    private String name;//usuniete final i dodany seter zeby zmienic nazwe
    private Set<TasksList> lists = new HashSet<>();//obiekt klasy hash podłączony jako własciwość,płytkie klonowanie skopiuje tylko referencje- nie obiekt

    public Board(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<TasksList> getLists() {
        return lists;
    }

    @Override
    public String toString() {
        String s = "Board [" + name + "]\n";
        for (TasksList list : lists) {
            s = s + list.toString() + "\n";
        }
        return s;
    }

    public Board shallowCopy() throws CloneNotSupportedException {
        return (Board)super.clone();
    }

    public Board deepCopy()throws CloneNotSupportedException {
        Board clonedBoard = (Board)super.clone();
        clonedBoard.lists = new HashSet<>();//nowy obiekt hash
        for(TasksList theList : lists) {
            TasksList clonedList = new TasksList(theList.getName());
            for(Task task : theList.getTasks()) {
                clonedList.getTasks().add(task);
            }
            clonedBoard.getLists().add(clonedList);
        }
        return clonedBoard;
    }
}
