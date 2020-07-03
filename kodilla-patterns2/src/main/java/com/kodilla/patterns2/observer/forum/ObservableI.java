package com.kodilla.patterns2.observer.forum;

public interface ObservableI {
    void registerObserver(ObserverI observer);
    void notifyObservers();//wysyła powiadomieniaże pojawił sie nowy post
    void removeObserver(ObserverI observer);
}
