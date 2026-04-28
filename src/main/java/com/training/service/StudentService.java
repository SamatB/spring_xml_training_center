package com.training.service;

public class StudentService {

    private CourseService courseService;

    //Внедрение через setter метод - DI setter injection
    public void setCourseService(CourseService courseService) {
        this.courseService = courseService;
    }

    public void register(String studentName, String courseName) {
        courseService.registerStudent(studentName, courseName);
    }
}
