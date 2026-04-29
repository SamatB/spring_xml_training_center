package com.training.repository;

import org.springframework.stereotype.Repository;

@Repository //@Component
public class CourseRepository {

    public boolean existsByName(String courseName) {
        return true;
    }

    public void saveEnrollment(String studentName, String courseName) {
        System.out.println("Запись сохранена: " + studentName + " -> " + courseName);
    }
}
