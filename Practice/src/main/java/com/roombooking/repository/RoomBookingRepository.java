package com.roombooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.roombooking.entity.RoomBooking;

public interface RoomBookingRepository extends JpaRepository<RoomBooking,Long>,
	JpaSpecificationExecutor<RoomBooking>{
	RoomBooking findByBookingId(Long bookingId);
}
