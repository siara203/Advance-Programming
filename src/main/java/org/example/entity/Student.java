package org.example.entity;

import org.example.core.Person;
import org.example.interfaces.NotifyInterface;

public class Student<StudentBuilder> extends Person implements NotifyInterface {
    private double accountBalance;
    private String studentID;
    private String enrollmentDate;



    public Student(int idS, String nameS){

    }

    public Student(String userID, String password, boolean loginStatus, String name, String address, String phoneNumber, String gender, String identifiCard, double accountBalance, String studentID, String enrollmentDate) {
        super(userID, password, loginStatus, name, address, phoneNumber, gender, identifiCard);
        this.accountBalance = accountBalance;
        this.studentID = studentID;
        this.enrollmentDate = enrollmentDate;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(String enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    @Override
    public void notification() {
        System.out.println("Student notify");
    }
}
