package org.example.interfaces;

import org.example.entity.Student;

import java.util.List;

public interface StudentInterface {
    Student addStudent(Student student);
    Student updateStudent(Student student);
    boolean deleteStudent(int studentID);
    List<Student> getAllStudents();
    Student getStudentById(int studentID);
}
