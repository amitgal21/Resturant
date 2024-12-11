package com.example.users.service;

import com.example.users.entity.userEntity;
import com.example.users.reposity.usersQuery;
import com.example.users.entity.userEntity;
import com.example.users.reposity.usersQuery;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class usersService {
    private final usersQuery usersQuery;

    public usersService(usersQuery usersQuery) {
        this.usersQuery = usersQuery;
    }

    public List<userEntity> getAllUsers() {
        return usersQuery.findAllUsers();
    }
}
