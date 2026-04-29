package com.training.service;

import com.training.repository.CourseRepository;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    private final CourseRepository courseRepository;
    private final NotificationService notificationService;

    //1 способоп внедрения (DI) - constructor injection
    public CourseService(CourseRepository courseRepository, NotificationService notificationService) {
        this.courseRepository = courseRepository;
        this.notificationService = notificationService;
    }

    public void registerStudent(String studentName, String courseName) {
        if (!courseRepository.existsByName(courseName)) {
            System.out.println("Курс не найден: " + courseName);
            return;
        }

        courseRepository.saveEnrollment(studentName, courseName);
        notificationService.send(studentName + " записан на курс " + courseName);
    }
}
