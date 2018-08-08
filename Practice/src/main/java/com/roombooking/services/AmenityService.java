package com.roombooking.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roombooking.entity.Amenity;
import com.roombooking.repository.AmenityRepository;
import com.roombooking.repository.RoomAmenityLinkRepository;

@Service("amenityService")
public class AmenityService {
	
	@Autowired
	private AmenityRepository amenityRepository;
	
	@Autowired
	private RoomAmenityLinkRepository roomAmenityMappingRepository;

	public List<Amenity> getAllAmenities(){
		return amenityRepository.findAll();
	}
	
	public Amenity saveAmenity(Amenity amenity){
		return amenityRepository.save(amenity);
	}
	
	public Amenity getAmenityId(Long amenityId){
		return amenityRepository.findOne(amenityId);
	}
	
	public void deleteAmenity(Long amenityId){
		roomAmenityMappingRepository.deleteInBatch(roomAmenityMappingRepository.findByAmenityId(amenityId));
		amenityRepository.delete(amenityId);
	}
	
	public Amenity updateAmenity(Long amenityId,Amenity amenity){
		if(amenityRepository.exists(amenityId)){
			amenity.setAmenityId(amenityId);
			return amenityRepository.save(amenity);
		}
		throw new RuntimeException("amenity does not exist with amenityId"+amenityId);
	}

}
