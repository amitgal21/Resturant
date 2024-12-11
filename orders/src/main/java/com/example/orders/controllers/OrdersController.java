package com.example.orders.controllers;


import com.example.orders.entity.OrdersEntity;
import com.example.orders.service.OrdersService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrdersController {
    final OrdersService OrdersService;
    public  OrdersController(OrdersService OrdersService)
    {
        this.OrdersService = OrdersService;
    }

    @GetMapping("/orders")
    public List<OrdersEntity> getOrders() {
        return OrdersService.getAllOrders();
    }
}
