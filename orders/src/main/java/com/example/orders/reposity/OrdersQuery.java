package com.example.orders.reposity;


import com.example.orders.entity.OrdersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface OrdersQuery extends JpaRepository<OrdersEntity, Long> {

    // get all orders from db
    @Query(value = "SELECT * FROM orders_schema.orders", nativeQuery = true)
    List<OrdersEntity> findAllOrders();
}

