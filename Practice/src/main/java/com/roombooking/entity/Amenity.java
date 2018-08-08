package com.roombooking.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "amenity")
public class Amenity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "amenity_id")
	private Long amenityId;
	
	@Column(name = "name_of_amenity")
	private String nameOfAmenity;

	@Column(name = "description")
	private String description;

	public Long getAmenityId() {
		return amenityId;
	}

	public void setAmenityId(Long amenityId) {
		this.amenityId = amenityId;
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

	@Override
	public String toString() {
		return "Amenity [amenityId=" + amenityId + ", nameOfAmenity=" + nameOfAmenity + ", description=" + description
				+ "]";
	}
}
