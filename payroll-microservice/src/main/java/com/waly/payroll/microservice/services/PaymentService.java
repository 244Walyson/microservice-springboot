package com.waly.payroll.microservice.services;

import com.waly.payroll.microservice.entities.Payment;
import com.waly.payroll.microservice.entities.Worker;
import com.waly.payroll.microservice.feignClients.WorkerFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class PaymentService {

    @Autowired
    private WorkerFeignClient workerFeignClient;

    @Autowired
    private RestTemplate restTemplate;

    public Payment getPayment(long workerId, int days){

        Worker worker = workerFeignClient.findById(workerId).getBody();
        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }
}
