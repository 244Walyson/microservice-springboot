package com.waly.worker.microservice.controllers;

import com.waly.worker.microservice.entities.Worker;
import com.waly.worker.microservice.repositories.WorkerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RefreshScope
@RestController
@RequestMapping(value = "/workers")
public class WorkerController {


//    @Value("${test.config}")
//    private String testConfig;

    @Autowired
    private Environment env;

    private static Logger logger = LoggerFactory.getLogger(WorkerController.class);

    @Autowired
    private WorkerRepository repository;

    @GetMapping
    public ResponseEntity<List<Worker>> findAll(){
        return ResponseEntity.ok(repository.findAll());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Worker> findById(@PathVariable Long id){
        logger.info("PORT = " + env.getProperty(("local.server.port")));
        return ResponseEntity.ok(repository.findById(id).orElseThrow());
    }

    @GetMapping(value = "/config")
    public ResponseEntity<Void> find(){
//        logger.info("CONFIG = " + testConfig);
        return ResponseEntity.noContent().build();
    }
}
