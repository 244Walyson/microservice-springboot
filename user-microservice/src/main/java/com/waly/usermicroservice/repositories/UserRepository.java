package com.waly.usermicroservice.repositories;

import com.waly.usermicroservice.Projections.UserDetailsProjection;
import com.waly.usermicroservice.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}
