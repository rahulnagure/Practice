package com.roombooking.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roombooking.entity.RoomAmenityLink;
import com.roombooking.repository.RoomAmenityLinkRepository;

@Service
public class RoomAmenityLinkService {
	
	@Autowired
	private RoomAmenityLinkRepository roomAmenityLinkRepository;
	
	public List<RoomAmenityLink> roomAmenityLinkList = new ArrayList<>();
	
	public RoomAmenityLink saveRoomAmenityLink(RoomAmenityLink roomAmenityMapping){
		return roomAmenityLinkRepository.save(roomAmenityMapping);
	}
	
	public List<RoomAmenityLink> getAllRoomAmenityLink(){
		return roomAmenityLinkRepository.findAll();
	}
	
	public List<RoomAmenityLink> getRoomAmenityLinkByRoomId(Long roomId){
		return roomAmenityLinkRepository.findByRoomId(roomId);
	}

	/*public List<RoomAmenityMapping> saveRoomAmenityMapping(Long roomId,RoomDTO roomDTO){
	for(Long amenityId : roomDTO.getAmenities()){
		RoomAmenityMapping roomAmenityMapping = new RoomAmenityMapping();
		roomAmenityMapping.setRoomId(roomDTO.getId());
		roomAmenityMapping.setAmenityId(amenityId);
		roomAmenityMappingList.add(roomAmenityMappingRepository.save(roomAmenityMapping));
	}
	return roomAmenityMappingList;
}*/
}
