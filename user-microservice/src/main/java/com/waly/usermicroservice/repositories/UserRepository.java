package com.waly.usermicroservice.repositories;

import com.waly.usermicroservice.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
