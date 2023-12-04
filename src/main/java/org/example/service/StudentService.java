package org.example.service;

import org.example.entity.Student;
import org.example.interfaces.StudentInterface;

import java.util.List;

public class StudentService implements StudentInterface{
    public static StudentService instance = null;
    public static  synchronized StudentService getInstance(){
        if(instance ==null){
            instance = new StudentService();
        }
        return instance;
    }


    @Override
    public Student addStudent(Student student) {
        return null;
    }

    @Override
    public Student updateStudent(Student student) {
        return null;
    }

    @Override
    public boolean deleteStudent(int studentID) {
        return false;
    }

    @Override
    public List<Student> getAllStudents() {
        return null;
    }

    @Override
    public Student getStudentById(int studentID) {
        return null;
    }
}
