package com.roombooking.specifications;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.domain.Specifications;
import org.springframework.stereotype.Service;

import com.roombooking.entity.RoomBooking;

@Service
public class RoomBookingSpecifications {

	public Specifications<RoomBooking> getBookingPossibleSpecs(RoomBooking roomBooking){
		return Specifications
				.where(searchByRoomId(roomBooking.getRoomId()))
				.and(getEntriesInRangeOfDates(roomBooking));
	}
	
	private Specification<RoomBooking> getEntriesInRangeOfDates(RoomBooking roomBooking) {
		return (root, query, cb)-> cb
				.and(cb.between(root.get("bookedFrom"), roomBooking.getBookedFrom(), roomBooking.getBookedTill())
					,cb.between(root.get("bookedTill"), roomBooking.getBookedFrom(), roomBooking.getBookedTill()));
	}

	private Specification<RoomBooking> searchByRoomId(Long roomId) {
		return (root, query, cb)-> cb.and(cb.equal(root.get("roomId"),roomId));
	}

}
