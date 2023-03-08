package com.gt.learnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gt.learnbds.entities.Resource;

public interface ResourceRepository extends JpaRepository<Resource, Long> {

}
