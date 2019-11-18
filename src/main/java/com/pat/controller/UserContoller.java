package com.pat.controller;

import com.pat.domain.Users;
import com.pat.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserContoller {

    @Autowired
    private UsersRepository usersRepository;

    @GetMapping( "/users")
    //@RequestMapping( value = "/api/users", method = RequestMethod.GET )
    public List<Users> getUsersList(){
        return usersRepository.findAll();
    }

}
