package org.example.interfaces;

import org.example.entity.Classroom;

import java.util.List;

public interface ClassroomInterface {
    Classroom addClassroom(Classroom classroom);
    Classroom updateClassroom(Classroom classroom);
    boolean deleteClassroom(String classID);
    List<Classroom> getAllClassrooms();
    Classroom getClassroomById(String classID);
}
