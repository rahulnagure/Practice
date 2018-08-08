package com.roombooking.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.roombooking.entity.Amenity;
import com.roombooking.entity.Room;
import com.roombooking.services.RoomService;

@RestController
@RequestMapping("/api/rooms")
public class RoomController {
	
	//private static final Logger logger = LoggerFactory.getLogger(RoomController.class);
	
	@Autowired
	private RoomService roomService;
	
	/**
	 * Saves the room with name and description in the room table 
	 * @param room
	 * @return
	 */
	@PostMapping
	public Room saveRoom(@RequestBody @Valid Room room){	
		return roomService.saveRoom(room);
	}
	
	/**
	 * gets all the rooms with pagination support
	 * @param pageable
	 * @return
	 */
	@GetMapping
	public Page<Room> getAllRooms(Pageable pageable){
		return roomService.getAllRooms(pageable);
	}
	
	/**
	 * Updates the room 
	 * @param room
	 * @return
	 */
	@PutMapping(path="/{roomId:[1-9]\\d*}")
	public Room updateRoom(@PathVariable(name="roomId")Long roomId, @RequestBody @Valid Room room){
		return roomService.updateRoom(roomId,room);
	}
	
	/**
	 * Deletes the room from given room Id
	 * @param roomId
	 */
	@DeleteMapping(path="/{roomId:[1-9]\\d*}")
	public void deleteRoom(@PathVariable(name="roomId")Long roomId){
		roomService.deleteRoom(roomId); 
	}
	
	@GetMapping(path = "/{roomId:[1-9]\\d*}/amenities")
	public List<Amenity> getAmenities(@PathVariable(name = "roomId")Long roomId){
		return roomService.getAmenitiesByRoomId(roomId);
	}
}
