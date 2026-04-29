package com.training.service;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public void pay(String studentName, int amount) {
        System.out.println(studentName + " оплатил " + amount + " рублей");
    }

}
