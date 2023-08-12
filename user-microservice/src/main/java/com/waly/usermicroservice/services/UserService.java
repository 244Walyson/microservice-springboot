package com.waly.usermicroservice.services;

import com.waly.usermicroservice.Projections.UserDetailsProjection;
import com.waly.usermicroservice.entities.Role;
import com.waly.usermicroservice.entities.User;
import com.waly.usermicroservice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public User findByEmail(String email){
        return repository.findByEmail(email);
    }

    public User findById(Long id){
        return repository.findById(id).orElseThrow();
    }

}
