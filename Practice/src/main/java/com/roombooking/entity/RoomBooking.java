package com.roombooking.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "room_booking")
public class RoomBooking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long bookingId;
	
	@NotNull(message="")
	@Column(name = "employee_id")
	private Long employeeId;
	
	@NotNull
	@Column(name = "booking_time")
	private Long bookingTime;
	
	@NotNull
	@Column(name = "booked_from")
	private Long bookedFrom;
	
	@NotNull
	@Column(name = "booked_till")
	private Long bookedTill;
	
	@NotNull
	@Column(name = "room_id")
	private Long roomId;
	
	@OneToOne
	@JoinColumn(name = "room_id", referencedColumnName = "room_id", insertable = false, updatable = false)
	private Room room;
	
	public Long getBookingId() {
		return bookingId;
	}

	public void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public Long getBookingTime() {
		return bookingTime;
	}

	public void setBookingTime(Long bookingTime) {
		this.bookingTime = bookingTime;
	}

	public Long getBookedFrom() {
		return bookedFrom;
	}

	public void setBookedFrom(Long bookedFrom) {
		this.bookedFrom = bookedFrom;
	}

	public Long getBookedTill() {
		return bookedTill;
	}

	public void setBookedTill(Long bookedTill) {
		this.bookedTill = bookedTill;
	}

	public Long getRoomId() {
		return roomId;
	}

	public void setRoomId(Long roomId) {
		this.roomId = roomId;
	}

	@Override
	public String toString() {
		return "RoomBooking [bookingId=" + bookingId + ", employeeId=" + employeeId + ", bookingTime=" + bookingTime
				+ ", bookedFrom=" + bookedFrom + ", bookedTill=" + bookedTill + ", roomId=" + roomId + "]";
	}
}
