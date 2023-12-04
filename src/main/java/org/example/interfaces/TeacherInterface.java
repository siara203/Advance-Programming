package org.example.interfaces;

import org.example.entity.Teacher;

import java.util.List;

public interface TeacherInterface {
    Teacher addTeacher(Teacher teacher);
    Teacher updateTeacher(Teacher teacher);
    boolean deleteTeacher(String teacherID);
    List<Teacher> getAllTeachers();
    Teacher getTeacherById(String teacherID);
}
