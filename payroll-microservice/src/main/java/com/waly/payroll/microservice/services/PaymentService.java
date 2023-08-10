package com.waly.payroll.microservice.services;

import com.waly.payroll.microservice.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPayment(long workerId, int days){
        return new Payment("bob", 100.00, days);
    }
}
