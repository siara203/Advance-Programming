package org.example.interfaces;

import org.example.entity.Schedule;

import java.util.List;

public interface ScheduleInterface {
    Schedule addSchedule(Schedule schedule);
    Schedule updateSchedule(Schedule schedule);
    boolean deleteSchedule(String scheduleID);
    List<Schedule> getAllSchedules();
    Schedule getScheduleById(String scheduleID);
}
