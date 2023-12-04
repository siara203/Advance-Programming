package org.example.entity;

import org.example.core.Person;
import org.example.interfaces.NotifyInterface;

public class Admin extends Person implements NotifyInterface {
    private String adminID;

    public Admin() {
    }

    public Admin(String userID, String password, boolean loginStatus, String name, String address, String phoneNumber, String gender, String identifiCard, String adminID) {
        super(userID, password, loginStatus, name, address, phoneNumber, gender, identifiCard);
        this.adminID = adminID;
    }


    @Override
    public void notification() {
        System.out.println("Admin");
    }
}
