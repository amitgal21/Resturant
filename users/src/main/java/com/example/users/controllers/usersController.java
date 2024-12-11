package com.example.users.controllers;

import com.example.users.entity.userEntity;
import com.example.users.reposity.usersQuery;
import com.example.users.service.usersService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class usersController {

    private final usersService usersService;

    // Constructor Injection
    public usersController(usersService usersService) {
        this.usersService = usersService;
    }

    @GetMapping("/users")
    public List<userEntity> getUsers() {
        return usersService.getAllUsers();
    }

}
