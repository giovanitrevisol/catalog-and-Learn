package com.gt.learnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gt.learnbds.entities.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
