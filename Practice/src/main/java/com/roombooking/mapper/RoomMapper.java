package com.roombooking.mapper;

import java.util.List;

import org.springframework.stereotype.Service;

import com.roombooking.DTO.RoomDTO;
import com.roombooking.entity.Room;
import com.roombooking.entity.RoomAmenityLink;

@Service
public class RoomMapper {
	
	public RoomDTO roomToRoomDTO(Room room,List<RoomAmenityLink> roomAmenityMappingList){
		RoomDTO roomDTO = new RoomDTO();
		roomDTO.setId(room.getId());
		roomDTO.setName(room.getName());
		roomDTO.setDescription(room.getDescription());
		
		int noOfAmenities = roomAmenityMappingList.size();
		Long amenities[] = new Long[noOfAmenities];
		
		for(int i=0; i<noOfAmenities; i++){
			amenities[i] = roomAmenityMappingList.get(i).getAmenityId();
		}
		
		roomDTO.setAmenities(amenities);
		return roomDTO;
	}
}
