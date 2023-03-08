package com.gt.learnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gt.learnbds.entities.Enrollment;
import com.gt.learnbds.entities.pk.EnrollmentPK;

public interface EnrollmentRepository extends JpaRepository<Enrollment, EnrollmentPK> {

}
