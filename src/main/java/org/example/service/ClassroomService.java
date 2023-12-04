package org.example.service;

import org.example.entity.Classroom;
import org.example.interfaces.ClassroomInterface;

import java.util.List;

public class ClassroomService implements ClassroomInterface {
    public static ClassroomService instance = null;
    public static synchronized ClassroomService getInstance()
    {
        if(instance == null){
            instance = new ClassroomService();
        }
        return instance;
    }


    public void deleteByTeacherID(String teacherID) {
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
