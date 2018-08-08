package com.roombooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.roombooking.entity.Amenity;

public interface AmenityRepository extends JpaRepository<Amenity,Long>{
	
}
