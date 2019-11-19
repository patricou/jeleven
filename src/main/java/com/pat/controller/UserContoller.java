package com.pat.controller;

import com.pat.domain.User;
import com.pat.repository.UsersRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@Api(value="Users API", description = "User API")
public class UserContoller {

    @Autowired
    private UsersRepository usersRepository;

    @GetMapping( value = "/users", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "Get the list of Users", response = User.class)
    public List<User> getUsersList(){
        return usersRepository.findAll();
    }

    @GetMapping( value = "/user/{username}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "Get the User from his name", response = User.class)
    public User getUser(@ApiParam(value = "User to be found", required = true) @PathVariable(value = "username") String  Username){
        return usersRepository.findUserByUsername(Username);
    }

}
