package com.roombooking.DTO;

import javax.validation.constraints.NotNull;

public class RoomDTO {
	
	private Long id;
	
	@NotNull
	private String name;
	
	private String description;
	
	private Long[] amenities;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long[] getAmenities() {
		return amenities;
	}

	public void setAmenities(Long[] amenities) {
		this.amenities = amenities;
	}
}
