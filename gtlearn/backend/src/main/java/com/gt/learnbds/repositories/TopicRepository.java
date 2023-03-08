package com.gt.learnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gt.learnbds.entities.Topic;

public interface TopicRepository extends JpaRepository<Topic, Long> {

}
