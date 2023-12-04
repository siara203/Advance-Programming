package org.example.entity;

import java.util.List;

public class Classroom {

    private String classID;
    private String className;
    private String teacherID;
    private int studentCount;
    private List<Student> students;

    public Classroom(){

    }
    public Classroom(String classID, String className, String teacherID, int studentCount, List<Student> students) {
        this.classID = classID;
        this.className = className;
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
}
