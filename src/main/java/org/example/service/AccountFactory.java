package org.example.service;

import org.example.entity.Admin;
import org.example.entity.Parent;
import org.example.entity.Student;
import org.example.entity.Teacher;
import org.example.interfaces.NotifyInterface;

public class AccountFactory {
    public static NotifyInterface createNotification(String type){
        if (type.equals("Student")) {
            return new Student<>(1, "Son");
        }else if (type.equals("Teacher")) {
            return new Teacher();
        }else if(type.equals("Parent")){
            return new Parent();
        }else if(type.equals("Admin")) {
            return new Admin();
        }
        throw new IllegalArgumentException("Invalid product type.");
    }
}
