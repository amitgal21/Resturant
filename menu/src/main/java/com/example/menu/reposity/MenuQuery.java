package com.example.menu.reposity;

import com.example.menu.entity.MenuEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MenuQuery extends JpaRepository<MenuEntity, Long> {
            // get all menu from db
    @Query(value = "SELECT * FROM menu_schema.menu", nativeQuery = true)
    List<MenuEntity> findAllMenu();

}
