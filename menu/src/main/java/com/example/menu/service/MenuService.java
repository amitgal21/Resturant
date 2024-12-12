package com.example.menu.service;


import com.example.menu.entity.MenuEntity;
import com.example.menu.reposity.MenuQuery;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {
    private final MenuQuery menuQuery;

    public MenuService(MenuQuery menuQuery) {
        this.menuQuery = menuQuery;
    }

    public List<MenuEntity> getAllMenu() {
        List<MenuEntity> menu = menuQuery.findAllMenu(); // קריאה לשאילתה
        System.out.println("Menu Items: " + menu); // הדפסת התוצאה
        return menu; // החזרת התוצאה ל-Controller
    }
}
