package com.carlosg.application.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlosg.application.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
