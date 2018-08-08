package com.roombooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.roombooking.entity.Amenity;
import com.roombooking.services.AmenityService;

@RestController
@RequestMapping("/api/amenity")
public class AmenityController {
	
	@Autowired
	private AmenityService amenityService;
	
	/**
	 * Gets all the amenities
	 * @return
	 */
	@GetMapping
	public List<Amenity> getAllAmenities(){
		return amenityService.getAllAmenities();
	}

	/**
	 * Saves all the amenities
	 * @param amenity
	 */
	@PostMapping
	public Amenity saveAmenities(@RequestBody Amenity amenity){
		return amenityService.saveAmenity(amenity);
	}
	
	/**
	 * Gets the amenities by amenityId
	 * @param amenityId
	 * @return
	 */
	@GetMapping("/{amenityId:[1-9]\\d*}")
	public Amenity getAmenitybyId(@PathVariable("amenityId") Long amenityId){
		return amenityService.getAmenityId(amenityId);
	}
	
	/**
	 * Deletes the amenities by amenityId
	 * @param amenityId
	 */
	@DeleteMapping("/{amenityId:[1-9]\\d*}")
	public void deleteAmenity(@PathVariable(name="amenityId")Long amenityId){
		amenityService.deleteAmenity(amenityId);
	}
	
	/**
	 * Updates an amenity by its object
	 * @param amenity
	 * @return
	 */
	@PutMapping("/{amenityId:[1-9]\\d*}")
	public Amenity updateAmenity(@PathVariable(name="amenityId")Long amenityId,@RequestBody Amenity amenity){
		return amenityService.updateAmenity(amenityId,amenity);
	}
}
