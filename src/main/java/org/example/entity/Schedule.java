package org.example.entity;
public class Schedule {
    private String scheduleID;
    private String courseID;
    private String classID;
    private String teacherID;

    public Schedule(){
    }
    public Schedule(String scheduleID, String courseID, String classID, String teacherID) {
        this.scheduleID = scheduleID;
        this.courseID = courseID;
        this.classID = classID;
        this.teacherID = teacherID;
    }

    public String getScheduleID() {
        return scheduleID;
    }

    public void setScheduleID(String scheduleID) {
        this.scheduleID = scheduleID;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getClassID() {
        return classID;
    }

    public void setClassID(String classID) {
        this.classID = classID;
    }

    public String getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(String teacherID) {
        this.teacherID = teacherID;
    }
}
