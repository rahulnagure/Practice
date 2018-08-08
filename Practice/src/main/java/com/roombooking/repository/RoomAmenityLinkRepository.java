package com.roombooking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.roombooking.entity.RoomAmenityLink;

@Repository
public interface RoomAmenityLinkRepository extends JpaRepository<RoomAmenityLink, Long>{
	List<RoomAmenityLink> findByAmenityId(Long amenityId);
	
	List<RoomAmenityLink> findByRoomId(Long roomId);
}
