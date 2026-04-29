package com.training.service;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private final PaymentService paymentService;
    private final CourseService courseService;

    public StudentService(PaymentService paymentService, CourseService courseService) {
        this.paymentService = paymentService;
        this.courseService = courseService;
    }

    //Внедрение через setter метод - DI setter injection
//    public void setCourseService(CourseService courseService) {
//        this.courseService = courseService;
//    }

    public void register(String studentName, String courseName, int amount) {
        paymentService.pay(studentName, amount);
        courseService.registerStudent(studentName, courseName);
    }
}
