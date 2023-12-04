package org.example.service;

import org.example.entity.Teacher;
import org.example.interfaces.TeacherInterface;

import java.util.List;

public class TeacherService implements TeacherInterface{
    public static TeacherService instance = null;
    public static  synchronized TeacherService getInstance(){
        if(instance ==null){
            instance = new TeacherService();
        }
        return instance;
    }

    @Override
    public Teacher addTeacher(Teacher teacher) {
        return null;
    }

    @Override
    public Teacher updateTeacher(Teacher teacher) {

        System.out.println("Update teacher");

        return null;
    }

    @Override
    public boolean deleteTeacher(String teacherID) {
        System.out.println("Delete teacher");

        return false;
    }

    @Override
    public List<Teacher> getAllTeachers() {
        return null;
    }

    @Override
    public Teacher getTeacherById(String teacherID) {
        return null;
    }

    public void update(Teacher teacher) {
    }
}
