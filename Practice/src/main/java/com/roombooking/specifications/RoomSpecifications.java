package com.roombooking.specifications;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.domain.Specifications;
import org.springframework.stereotype.Service;

import com.roombooking.entity.Room;

@Service
public class RoomSpecifications {
	
	public Specifications<Room> getRoomsWithAmenities(Long roomId){
		return Specifications.where(getRoomsWithAmenitiesSub(roomId));
	}
	
	private Specification<Room> getRoomsWithAmenitiesSub(Long roomId){
		return (root, query, cb)-> cb.equal(root.join("RoomAmenityMapping").get("roomId"),roomId);
	}
}
