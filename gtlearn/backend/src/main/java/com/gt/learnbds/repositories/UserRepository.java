package com.gt.learnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gt.learnbds.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);
}
