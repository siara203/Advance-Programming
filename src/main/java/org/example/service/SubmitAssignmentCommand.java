package org.example.service;

import org.example.entity.Classroom;
import org.example.entity.Student;
import org.example.interfaces.ClassroomInterface;

import java.util.List;


public class SubmitAssignmentCommand implements ClassroomInterface {
    private Student student;
    private String assignment;

    public SubmitAssignmentCommand(Student student, String assignment) {
        this.student = student;
        this.assignment = assignment;
    }

    @Override
    public void execute() {
        if (student != null) {
            student.submitAssignment(assignment);
        } else {
            System.out.println("Error: Student object is null.");
        }
    }

    @Override
    public Classroom addClassroom(Classroom classroom) {
        return null;
    }

    @Override
    public Classroom updateClassroom(Classroom classroom) {
        return null;
    }

    @Override
    public boolean deleteClassroom(String classID) {
        return false;
    }

    @Override
    public List<Classroom> getAllClassrooms() {
        return null;
    }

    @Override
    public Classroom getClassroomById(String classID) {
        return null;
    }
}
