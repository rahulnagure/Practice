package com.roombooking.services;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.roombooking.DTO.RoomDTO;
import com.roombooking.entity.Amenity;
import com.roombooking.entity.Room;
import com.roombooking.entity.RoomAmenityLink;
import com.roombooking.repository.AmenityRepository;
import com.roombooking.repository.RoomAmenityLinkRepository;
import com.roombooking.repository.RoomRepository;

@Service
@Transactional
public class RoomService {
	
	@Autowired
	private RoomRepository roomRepository;
		
	@Autowired
	private RoomAmenityLinkRepository roomAmenityMappingRepository;
		
	@Autowired
	private RoomAmenityLinkService roomAmenityLinkService;
	
	@Autowired
	private AmenityRepository amenityRepository;
	
	public Room saveARoom(RoomDTO roomDTO){
		Room room = new Room();
		room.setName(roomDTO.getName());
		room.setDescription(roomDTO.getDescription());
		return roomRepository.save(room);
	}
	
	public Room saveRoom(Room room){
		Room savedRoom = roomRepository.saveAndFlush(room);
		if(room.getAmenities().size()==0){
			return savedRoom;
		}
		addAmenitiesForRoom(room, savedRoom.getId());
		return savedRoom;
 	}

	public Room updateRoom(Long roomId,Room room){
		Room roomExisting = roomRepository.getOne(roomId);
		if(roomExisting==null){
			throw new RuntimeException("Room not found with id:"+room.getId());
		}	
		room.setId(roomId);
		return room;
	}

	private void addAmenitiesForRoom(Room room, Long roomId) {		
		RoomAmenityLink roomAmenityMapping = null;
		//List<RoomAmenityMapping> roomAmenityMappingList = new ArrayList<>();
		for(int i=0;i<room.getAmenities().size();i++){
			roomAmenityMapping = new RoomAmenityLink();
			roomAmenityMapping.setRoomId(roomId);
			roomAmenityMapping.setAmenityId(room.getAmenities().get(i));
			roomAmenityMappingRepository.save(roomAmenityMapping);
			//roomAmenityMappingList.add(roomAmenityMappingRepository.save(roomAmenityMapping));
		}
	}
		
	public Page<Room> getAllRooms(Pageable pageable){
		//Page<Room> rooms = roomRepository.findAll(pageable);
		 return roomRepository.findAll(pageable);
	}
	
	public void deleteRoom(Long roomId){
		if(roomRepository.getOne(roomId)==null){
			throw new RuntimeException("Room not found with id:"+roomId);
		}
		roomRepository.delete(roomId);
	}
	
	public List<Amenity> getAmenitiesByRoomId(Long roomId){
		List<RoomAmenityLink> roomAmenityLinkList = roomAmenityLinkService.getRoomAmenityLinkByRoomId(roomId);
		List<Amenity> amenities = new ArrayList<>();
		for(RoomAmenityLink roomAmenityLink : roomAmenityLinkList){
			amenities.add(amenityRepository.findOne(roomAmenityLink.getAmenityId()));
		}
		return amenities;
	}
}
