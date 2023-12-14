package org.example.entity;

import org.example.interfaces.PersonComponent;

import java.util.ArrayList;
import java.util.List;

public class Classroom implements PersonComponent {
    private String classID;
    private String className;
    private String teacherID;
    private int studentCount;
    private List<Student> students;
    private List<PersonComponent> members = new ArrayList<>();
    public Classroom( String className){
        this.className = className;
    }
    public void addMember(PersonComponent member) {
        members.add(member);
    }
    public Classroom(String classID, String teacherID, int studentCount, List<Student> students) {
        this.classID = classID;

        this.teacherID = teacherID;
        this.studentCount = studentCount;
        this.students = students;
    }

    public String getClassID() {
        return classID;
    }

    public void setClassID(String classID) {
        this.classID = classID;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(String teacherID) {
        this.teacherID = teacherID;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public void displayInfo() {
        System.out.println("Classroom: " + className);
        for (PersonComponent member : members) {
            member.displayInfo();
        }
    }
}
