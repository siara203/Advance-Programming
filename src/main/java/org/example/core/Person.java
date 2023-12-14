package org.example.core;

public abstract class Person {
    private String userID;
    private String password;
    private boolean loginStatus;
    private String name;
    private String address;
    private String phoneNumber;
    private String gender;
    private String identifiCard;
    public Person(){

    }

    public Person(String userID, String password, boolean loginStatus, String name, String address, String phoneNumber, String gender, String identifiCard) {
        this.userID = userID;
        this.password = password;
        this.loginStatus = loginStatus;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.identifiCard = identifiCard;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(boolean loginStatus) {
        this.loginStatus = loginStatus;
    }

    public String getName() {
        return name;
    }

    public abstract Person build();
}
