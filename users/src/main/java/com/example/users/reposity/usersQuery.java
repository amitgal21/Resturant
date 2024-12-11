package com.example.users.reposity;


import com.example.users.entity.userEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface usersQuery extends JpaRepository<userEntity, Long> {
    // get all orders from db
    @Query(value = "SELECT * FROM user_schema.users", nativeQuery = true)
    List<userEntity> findAllUsers();
}
