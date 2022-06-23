package com.autho.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.autho.api.entity.User;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUserName(String username);
}
