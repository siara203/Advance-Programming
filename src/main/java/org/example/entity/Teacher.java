package org.example.entity;

import org.example.core.Person;
import org.example.interfaces.NotifyInterface;
import org.example.interfaces.PersonComponent;

public class Teacher extends Person implements NotifyInterface, PersonComponent {
    private String teacherID;
    private String teacherName;
    private String phoneNumber;



    public Teacher(String userID, String password, boolean loginStatus, String name, String address, String phoneNumber, String gender, String identifiCard, String teacherID, String teacherName) {
        super(userID, password, loginStatus, name, address, phoneNumber, gender, identifiCard);
        this.teacherID = teacherID;
        this.teacherName=teacherName;
        this.phoneNumber=phoneNumber;
    }

    public Teacher() {
    }

    public Teacher(int idT, String nameT) {
        this.teacherID = String.valueOf(idT);
        this.teacherName=nameT;
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
    public Person build() {
        return null;
    }

    @Override
    public void notification() {
        System.out.println("Teacher notify");
    }

    public void takeAttendance() {
        System.out.println("Attendance taken for the class.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Teacher: " + teacherName);
    }
}
