package com.waly.oauthmicroservice.service;

import com.waly.oauthmicroservice.FeignClient.UserFeignClient;
import com.waly.oauthmicroservice.entities.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {

    private Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserFeignClient userFeignClient;


    public User findByEmail(String email){
        User user = userFeignClient.searchByEmail(email).getBody();
        if (user==null){
            logger.info("email not found " + email);
            throw new RuntimeException("Email not found");
        }
        logger.info("email found " + email);
        return user;
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userFeignClient.searchByEmail(username).getBody();
        if (user==null){
            logger.info("email not found " + username);
            throw new UsernameNotFoundException("Email not found");
        }
        logger.info("email found " + username);
        return user;
    }
}
