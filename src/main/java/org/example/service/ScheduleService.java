package org.example.service;

public class ScheduleService {
    private ClassroomService classroomService;
    private TeacherService teacherService;

    public ScheduleService() {
        classroomService = new ClassroomService();
        teacherService = new TeacherService();
    }
    public void operationDeleteTeacher(String teacherID) {
        classroomService.deleteByTeacherID(teacherID);
        teacherService.deleteTeacher(teacherID);
    }
}
