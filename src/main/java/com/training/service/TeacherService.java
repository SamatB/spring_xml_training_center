package com.training.service;

import org.springframework.stereotype.Service;

@Service
public class TeacherService {

    private final NotificationService notificationService;

    public TeacherService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void assignTeacher(String teacherName, String courseName) {
        System.out.println("Преподаватель " + teacherName + " назначен на курс " + courseName);
        notificationService.send("Преподавателю " + teacherName + " назначен курс " + courseName);
    }
}
