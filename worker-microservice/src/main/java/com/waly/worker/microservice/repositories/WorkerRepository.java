package com.waly.worker.microservice.repositories;

import com.waly.worker.microservice.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
