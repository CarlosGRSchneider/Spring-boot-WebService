package com.carlosg.application.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlosg.application.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
