package com.training.service;

public class CourseService {

    private final NotificationService notificationService;

    //1 способоп внедрения (DI) - constructor injection
    public CourseService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void registerStudent(String studentName, String courseName) {
        System.out.println(studentName + " записан на курс: " + courseName);
        notificationService.send(studentName + ", добро пожаловать на курс: " + courseName);
    }
}
