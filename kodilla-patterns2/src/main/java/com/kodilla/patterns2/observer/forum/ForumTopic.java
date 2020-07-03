package com.kodilla.patterns2.observer.forum;

import java.util.ArrayList;
import java.util.List;

public class ForumTopic implements ObservableI {
    private final  List<ObserverI> observers;
    private final List<String> messages;
    private final String name;

    public ForumTopic(String name) {//?
        observers = new ArrayList<>();
        messages = new ArrayList<>();
        this.name = name;
    }

    public void addPost(String post) {
        messages.add(post);
        notifyObservers();
    }
    @Override
    public void registerObserver(ObserverI observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for(ObserverI observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(ObserverI observer) {
        observers.remove(observer);
    }

    public List<ObserverI> getObservers() {
        return observers;
    }

    public List<String> getMessages() {
        return messages;
    }

    public String getName() {
        return name;
    }
}
