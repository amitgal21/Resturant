package com.example.menu.controllers;


import com.example.menu.entity.MenuEntity;
import com.example.menu.service.MenuService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MenuController {
    private final MenuService menuService;

    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    @GetMapping("/menu")
    public List<MenuEntity> getMenu() {
        return menuService.getAllMenu(); // Correct usage
    }
}

