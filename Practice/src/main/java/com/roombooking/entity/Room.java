package com.roombooking.entity;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "room")
public class Room {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "room_id",nullable = false)
	private Long id;
	
	@Column(name = "name")
	@NotNull
	private String name;
	
	@Column(name = "description")
	@NotNull
	private String description;
	
	@Transient	
	private List<Long> amenities = new ArrayList<>();
	
//	@ManyToMany(cascade = CascadeType.DETACH)
//	@JoinTable(name = "room_amenity_link", joinColumns = {@JoinColumn(name = "room_id")}, inverseJoinColumns = {@JoinColumn(name = "amenity_id")}) 
//	private Set<Amenity> amenities = new HashSet<>();
	
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

	public List<Long> getAmenities() {
		return amenities;
	}

	public void setAmenities(List<Long> amenities) {
		this.amenities = amenities;
	}

	@Override
	public String toString() {
		return "Room [id=" + id + ", name=" + name + ", description=" + description + ", amenities=" + amenities + "]";
	}
}
