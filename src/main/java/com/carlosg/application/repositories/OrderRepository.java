package com.carlosg.application.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlosg.application.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
