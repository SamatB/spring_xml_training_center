package com.training;

import com.training.service.NotificationService;
import com.training.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        NotificationService notificationService =
                context.getBean("notificationService", NotificationService.class);
        notificationService.send("Мухаммед ушел с урока очень рано");

        StudentService studentService =
                context.getBean("studentService", StudentService.class);

        studentService.register("Aisezim", "Java 11 - Spring course");
    }
}