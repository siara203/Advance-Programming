package org.example.entity;

import org.example.core.Person;
import org.example.interfaces.NotifyInterface;

public class Parent extends Person implements NotifyInterface {
    private String parentID;
    private String studentID;

    public Parent() {
    }

    @Override
    public Person build() {
        return null;
    }

    public Parent(String userID, String password, boolean loginStatus, String name, String address, String phoneNumber, String gender, String identifiCard, String parentID, String studentID) {
        super(userID, password, loginStatus, name, address, phoneNumber, gender, identifiCard);
        this.parentID = parentID;
        this.studentID = studentID;
    }

    public String getParentID() {
        return parentID;
    }

    public void setParentID(String parentID) {
        this.parentID = parentID;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    @Override
    public void notification() {
        System.out.println("Parent notify");
    }
}
