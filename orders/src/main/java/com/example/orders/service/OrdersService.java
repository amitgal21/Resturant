package com.example.orders.service;


import com.example.orders.entity.OrdersEntity;
import com.example.orders.reposity.OrdersQuery;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrdersService {

    private final OrdersQuery OrdersQuery;


    public OrdersService(OrdersQuery OrdersQuery) {
        this.OrdersQuery = OrdersQuery;
    }

    public List<OrdersEntity> getAllOrders() {
        return OrdersQuery.findAllOrders();
    }
}


