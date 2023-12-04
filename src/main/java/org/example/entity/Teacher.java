package org.example.entity;

import org.example.core.Person;
import org.example.interfaces.NotifyInterface;

public class Teacher extends Person implements NotifyInterface {
    private String teacherID;
    private String teacherName;
    private String phoneNumber;

    public Teacher() {

    }

    public Teacher(String userID, String password, boolean loginStatus, String name, String address, String phoneNumber, String gender, String identifiCard, String teacherID, String teacherName) {
        super(userID, password, loginStatus, name, address, phoneNumber, gender, identifiCard);
        this.teacherID = teacherID;
        this.teacherName=teacherName;
        this.phoneNumber=phoneNumber;
    }

    public Teacher(int idT, String nameT) {
    }

    public String getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(String teacherID) {
        this.teacherID = teacherID;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void notification() {
        System.out.println("Teacher notify");
    }
}
