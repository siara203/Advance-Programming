package org.example.service;

import org.example.core.Person;
import org.example.interfaces.ObserverInterface;

import java.util.List;

public class PersonObserverInterface implements ObserverInterface {
    @Override
    public void update(List<Person> persons) {
        System.out.println("Person list is updated. New list: " + persons);
    }
}
