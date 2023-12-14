package org.example.interfaces;

public interface SubjectInterface {
    void addObserver(ObserverInterface observerInterface);
    void removeObserver(ObserverInterface observerInterface);
    void notifyObservers();
}
