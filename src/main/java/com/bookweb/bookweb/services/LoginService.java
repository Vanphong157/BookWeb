package com.bookweb.bookweb.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.bookweb.bookweb.models.User;
import com.bookweb.bookweb.repositories.UserRepository;
import com.bookweb.bookweb.services.imp.LoginServiceImp;
import java.util.List;

/**
 * LoginService
 */
@Service
public class LoginService implements LoginServiceImp{

    @Autowired
    UserRepository userRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    public List<User> getAllUser(){
   
        return null;
    }

    public boolean checkLogin(String username, String password){
        
        User user  =  userRepository.findByUsername(username);
        return passwordEncoder.matches(password, user.getPassword());
    }
    
}