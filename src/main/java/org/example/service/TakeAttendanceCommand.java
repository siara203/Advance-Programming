package org.example.service;

import org.example.entity.Classroom;
import org.example.entity.Teacher;
import org.example.interfaces.ClassroomInterface;

import java.util.List;

public class TakeAttendanceCommand implements ClassroomInterface {
    private Teacher teacher;
    public TakeAttendanceCommand(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public void execute() {
        teacher.takeAttendance();
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
