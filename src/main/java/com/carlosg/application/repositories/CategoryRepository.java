package com.carlosg.application.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlosg.application.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
