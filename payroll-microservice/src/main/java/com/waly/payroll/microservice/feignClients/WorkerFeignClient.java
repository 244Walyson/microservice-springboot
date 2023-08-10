package com.waly.payroll.microservice.feignClients;

import com.waly.payroll.microservice.entities.Worker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(name = "worker", url = "localhost:8001", path = "/workers")
public interface WorkerFeignClient {

    @GetMapping(value = "/{id}")
    ResponseEntity<Worker> findById(@PathVariable Long id);
}
