package org.example.entity;

import org.example.core.Person;
import org.example.interfaces.NotifyInterface;
import org.example.interfaces.PersonComponent;

public class Student extends Person implements NotifyInterface, PersonComponent {

    private double accountBalance;
    private int studentID;
    private String enrollmentDate;
    private String studentName;
    public Student(int idS, String nameS) {
        super();
        this.studentID = idS;
        this.accountBalance = 0.0;
        this.enrollmentDate = "";
        this.studentName=nameS;
    }

    public Student(int studentID, String userID, String password, boolean loginStatus, String name, String address, String phoneNumber, String gender, String identifiCard, double accountBalance, String enrollmentDate) {
        super(userID, password, loginStatus, name, address, phoneNumber, gender, identifiCard);
        this.accountBalance = accountBalance;
        this.studentID = studentID;
        this.enrollmentDate = enrollmentDate;
    }

    public Student() {

    }

    @Override
    public Person build() {
        return null;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
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

    public void submitAssignment(String assignment) {
        System.out.println(studentName + " has submitted the assignment: " + assignment);
    }
    @Override
    public String toString() {
        return "Student{id=" + getStudentID() + ", name='" + getName() + "'}";
    }

    @Override
    public void displayInfo() {
        System.out.println("Student: " + studentName);
    }
}
