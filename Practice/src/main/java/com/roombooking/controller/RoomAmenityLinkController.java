package com.roombooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.roombooking.entity.RoomAmenityLink;
import com.roombooking.services.RoomAmenityLinkService;

@RestController
@RequestMapping("/api/room-amenity-mappings")
public class RoomAmenityLinkController {
	
	@Autowired
	RoomAmenityLinkService roomAmenityMappingService;
	
	/**
	 * Gets all amenities for the room by its room id
	 * @param roomId
	 * @return
	 */
	@GetMapping("/{room-id}")
	public List<RoomAmenityLink> getRoomAmenityMapping(@PathVariable (value="room-id")Long roomId){
		return roomAmenityMappingService.getRoomAmenityLinkByRoomId(roomId);		
	}
	
	/**
	 * Gets all the room ids and their amenities
	 * @return
	 */
	@GetMapping
	public List<RoomAmenityLink> getAllroomAmenityMapping(){
		return roomAmenityMappingService.getAllRoomAmenityLink();
	}
	
	/**
	 * Saves the room amenity mapping
	 * @param roomAmenityMapping
	 * @return
	 */
	@PostMapping
	public RoomAmenityLink saveRoomAmenityMapping(@RequestBody RoomAmenityLink roomAmenityMapping){
		return roomAmenityMappingService.saveRoomAmenityLink(roomAmenityMapping);
	}
}
