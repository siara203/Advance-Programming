package org.example;

import org.example.entity.Admin;
import org.example.entity.Classroom;
import org.example.entity.Student;
import org.example.entity.Teacher;
import org.example.interfaces.ClassroomInterface;
import org.example.interfaces.ManagerStudentInterface;
import org.example.interfaces.NotifyInterface;
import org.example.interfaces.UpdateInfoRequest;
import org.example.service.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //1.Singleton - Creational
        System.out.println("1.Singleton===============================================================");
        Teacher teacher = new Teacher(1,"Teacher 1");
        TeacherService.getInstance().addTeacher(teacher);
        System.out.println("Test");

        //2.Iterator - Behavioral
        System.out.println("2.Iterator================================================================");
        List<String> studentList = new ArrayList<>();
        studentList.add("student1");
        studentList.add("student2");
        studentList.add("student3");
        Iterator<String> iterator = studentList.iterator();
        while (iterator.hasNext()) {
            String student = iterator.next();
            System.out.println(student);

        }


        //3.Adapter - Structural
        System.out.println("3.Adapter=================================================================");
        UpdateInfoRequest updateInfoRequest = new AdminService(TeacherService.getInstance());
        updateInfoRequest.updateInfoTeacher(teacher);




        //4.Factory Method - Creational
        System.out.println("4.Factory Method==========================================================");
        NotifyInterface notifyStudent = AccountFactory.createNotification("Student");
        notifyStudent.notification();

        NotifyInterface notifyTeacher = AccountFactory.createNotification("Teacher");
        notifyTeacher.notification();

        NotifyInterface notifyParent = AccountFactory.createNotification("Parent");
        notifyParent.notification();

        //5.Facade - Structural
        System.out.println("5.Facade==================================================================");
        ScheduleService facadeService = new ScheduleService();
        facadeService.operationDeleteTeacher("Teacher");

        //6.Proxy - Structural
        System.out.println("6.Proxy===================================================================");
        ManagerStudentInterface studentManager = new ProxyStudentManager();
        studentManager.enrollStudent("Student 1");
        studentManager.enrollStudent("Student 2");
        studentManager.listStudents();
        studentManager.expelStudent("Student 1");
        studentManager.listStudents();

        //7.Commands-Behavioral
        System.out.println("7.Commands================================================================");
        Student studentCom = new Student(1, "Student A");
        Teacher teacherCom = new Teacher(1, "Dinh Van Dong");

        ClassroomService classroom = new ClassroomService();
        ClassroomInterface submitAssignmentCommand = new SubmitAssignmentCommand(studentCom, "Java Homework");
        ClassroomInterface takeAttendanceCommand = new TakeAttendanceCommand(teacherCom);

        classroom.addActivity(submitAssignmentCommand);
        classroom.addActivity(takeAttendanceCommand);

        classroom.executeActivities();

        //8.Observer - Behavioral
        System.out.println("8.Observer================================================================");
        PersonList personList = new PersonList();
        PersonObserverInterface observer = new PersonObserverInterface();
        personList.addObserver(observer);

        personList.addPerson(new Student());
        personList.removePerson(new Student());

        //9.Composite - Structural
        System.out.println("9.Composite===============================================================");
        Classroom classroomLeaf = new Classroom("ABC");

        Student student10 = new Student(10,"Student Nam");
        Student student11 = new Student(11,"Student Lan");
        Teacher teacher12 = new Teacher(12,"Dinh Van Dong");

        classroomLeaf.addMember(student10);
        classroomLeaf.addMember(student11);
        classroomLeaf.addMember(teacher12);

        classroomLeaf.displayInfo();
    }
}