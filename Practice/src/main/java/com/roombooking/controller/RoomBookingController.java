package com.roombooking.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.roombooking.entity.RoomBooking;
import com.roombooking.services.RoomBookingService;

@RestController
@RequestMapping("/api/room-booking")
public class RoomBookingController {
	
	@Autowired
	private RoomBookingService roomBookingService;
	
	/**
	 * checks for existing bookings and if possible saves the new booking
	 * @param roomBooking
	 * @return
	 */
	@PostMapping
	public RoomBooking saveRoomBooking(@RequestBody @Valid RoomBooking roomBooking){		
		return roomBookingService.saveRoomBooking(roomBooking);
	}
	
	/**
	 * Deletes a room booking by its bookingId
	 * @param bookingId
	 * @return
	 */
	@DeleteMapping(path="/{bookingId:[1-9]\\d*}")
	public void deleteRoomBooking(@RequestParam(name = "bookingId")Long bookingId){
		roomBookingService.deleteRoomBooking(bookingId);
	}
	 
	/**
	 * Updates the room booking by its bookingId
	 * @param bookingId
	 * @param roomBooking
	 * @return
	 */
	@PutMapping(path="/{bookingId:[1-9]\\d*}")
	public RoomBooking updateRoomBooking(@PathVariable(name="bookingId")Long bookingId, @RequestBody @Valid RoomBooking roomBooking){
		return roomBookingService.updateRoomBooking(bookingId,roomBooking);
	}
	
	@PostMapping("/search-room-booking")
	public List<RoomBooking> searchRoomBookings(@RequestBody RoomBooking roomBooking){
		return roomBookingService.searchRoomBooking(roomBooking);
	}
}
