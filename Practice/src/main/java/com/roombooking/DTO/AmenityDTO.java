package com.roombooking.DTO;

public class AmenityDTO {
	
	private Long id;
	
	private String nameOfAmenity;

	private String description;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNameOfAmenity() {
		return nameOfAmenity;
	}

	public void setNameOfAmenity(String nameOfAmenity) {
		this.nameOfAmenity = nameOfAmenity;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
