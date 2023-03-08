package com.gt.learnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gt.learnbds.entities.Offer;

public interface OfferRepository extends JpaRepository<Offer, Long> {

}
