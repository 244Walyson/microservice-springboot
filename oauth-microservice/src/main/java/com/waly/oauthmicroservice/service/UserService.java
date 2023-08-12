package com.waly.oauthmicroservice.service;

import com.waly.oauthmicroservice.FeignClient.UserFeignClient;
import com.waly.oauthmicroservice.entities.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

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
}
