package com.roombooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.roombooking.entity.Room;

public interface RoomRepository extends JpaRepository<Room, Long> ,PagingAndSortingRepository<Room,Long>, JpaSpecificationExecutor<Room>{

	//Page<Room> findAll(Pageable pageable, RoomSpecifications roomSpecifications);

}
