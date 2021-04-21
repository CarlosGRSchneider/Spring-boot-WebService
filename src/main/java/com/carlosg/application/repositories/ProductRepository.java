package com.carlosg.application.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlosg.application.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
