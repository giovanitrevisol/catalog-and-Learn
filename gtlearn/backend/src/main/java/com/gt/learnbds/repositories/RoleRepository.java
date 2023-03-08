package com.gt.learnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gt.learnbds.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
