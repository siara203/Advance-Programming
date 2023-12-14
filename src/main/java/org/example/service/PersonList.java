package org.example.service;

import org.example.core.Person;
import org.example.interfaces.ObserverInterface;
import org.example.interfaces.SubjectInterface;

import java.util.ArrayList;
import java.util.List;

public class PersonList implements SubjectInterface {
    private List<ObserverInterface> observerInterfaces = new ArrayList<>();
    private List<Person> persons = new ArrayList<>();

    public void addPerson(Person person) {
        persons.add(person);
        notifyObservers();
    }

    public void removePerson(Person person) {
        persons.remove(person);
        notifyObservers();
    }

    @Override
    public void addObserver(ObserverInterface observerInterface) {
        observerInterfaces.add(observerInterface);
    }

    @Override
    public void removeObserver(ObserverInterface observerInterface) {
        observerInterfaces.remove(observerInterface);
    }

    @Override
    public void notifyObservers() {
        for (ObserverInterface observerInterface : observerInterfaces) {
            observerInterface.update(persons);
        }
    }
}
