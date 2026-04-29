package com.training;

import com.training.config.AppConfig;
import com.training.service.StudentService;
import com.training.service.TeacherService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        StudentService studentService = context.getBean(StudentService.class);
        TeacherService teacherService = context.getBean(TeacherService.class);

        teacherService.assignTeacher("Айбек", "Spring Core");
        System.out.println("============================");
        studentService.register("Алишер", "Spring Core", 5000);
        studentService.register("Muhos", "Spring Core", 4500);
        System.out.println("============================");

        teacherService.assignTeacher("Мээрим", "Java Core");
        System.out.println("============================");
        studentService.register("Albertos", "Java Core", 5000);
        studentService.register("Samat", "Java Core", 4500);
        System.out.println("============================");

    }
}