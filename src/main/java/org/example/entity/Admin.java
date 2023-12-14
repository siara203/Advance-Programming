package org.example.entity;

import org.example.core.Person;
import org.example.interfaces.NotifyInterface;
import org.example.interfaces.PersonComponent;

public class Admin extends Person implements NotifyInterface, PersonComponent {
    private String adminID;
    public Admin() {
    }

    @Override
    public Person build() {
        return null;
    }

    public Admin(String userID, String password, boolean loginStatus, String name, String address, String phoneNumber, String gender, String identifiCard, String adminID) {
        super(userID, password, loginStatus, name, address, phoneNumber, gender, identifiCard);
        this.adminID = adminID;
    }


    @Override
    public void notification() {
        System.out.println("Admin");
    }

    @Override
    public void displayInfo() {
        System.out.println("Admin: " + adminID);
    }
}
