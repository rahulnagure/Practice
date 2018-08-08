package com.roombooking.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specifications;
import org.springframework.stereotype.Service;

import com.roombooking.entity.Room;
import com.roombooking.entity.RoomBooking;
import com.roombooking.repository.RoomBookingRepository;
import com.roombooking.repository.RoomRepository;
import com.roombooking.specifications.RoomBookingSpecifications;

@Service
public class RoomBookingService {
	
	@Autowired
	private RoomRepository roomRepository;
	
	@Autowired
	private RoomBookingRepository roomBookingRepository;
	
	@Autowired
	private RoomBookingSpecifications roomBookingSpecifications;

	public RoomBooking saveRoomBooking(RoomBooking roomBooking){
		if(roomExists(roomBooking.getRoomId()) && bookingPossible(roomBooking)){
			return roomBookingRepository.save(roomBooking);			
		}
//		Specifications<RoomBooking> specifications = Specifications.where(searchByName("Sanket"));
//		roomBookingRepository.findAll(specifications);
		throw new RuntimeException("Room booking not possible");
	}
	
//	private Specification<RoomBooking> searchByName(String string) {
//		return (root, query, cb) -> cb.and(cb.equal(root.get("employeeId"), string));
//	}

	public RoomBooking updateRoomBooking(Long bookingId,RoomBooking roomBooking){
		if(bookingExist(roomBooking.getBookingId())){
			if(roomExists(roomBooking.getRoomId()) && bookingPossible(roomBooking)){
				roomBooking.setBookingId(bookingId);
				return roomBookingRepository.save(roomBooking);			
			}	
			throw new RuntimeException("Booking not possible or room id not found");
		}
		throw new RuntimeException("Booking not found");
	}
	
	public void deleteRoomBooking(Long bookingId){
		if(roomBookingRepository.findByBookingId(bookingId)!=null){
			roomBookingRepository.delete(bookingId);
		}
		else{
			throw new RuntimeException("Room not found with booking id:"+bookingId);
		}
	}
	
	public List<RoomBooking> searchRoomBooking(RoomBooking roomBooking){
		if(roomBooking!=null){
			
		}
		return roomBookingRepository.findAll();
	}
	
	private boolean roomExists(Long roomId){
		Room room = roomRepository.getOne(roomId);
		if(room!=null){
			return true;
		}
		else{
			return false;
		}
	}
	
	private boolean bookingPossible(RoomBooking roomBooking){
		Specifications<RoomBooking> specificationsForPossibleBookings = roomBookingSpecifications.getBookingPossibleSpecs(roomBooking);
		
		List<RoomBooking> existingBookings = roomBookingRepository.findAll(specificationsForPossibleBookings);
		
		if(!existingBookings.isEmpty()){
			System.out.println("Existing bookings:"+existingBookings.toString());
			return false;
		}
		return true;	
	}
	
	private boolean bookingExist(Long bookingId){
		return roomBookingRepository.exists(bookingId);
	}
	
//	private List<RoomBooking> getBookingBetweenGivenBooking(RoomBooking roomBooking){
//		String queryStatement = "from RoomBooking roomBooking where "
//				+ "((roomBooking.bookedFrom between :startDate and :endDate) or"
//				+ " (roomBooking.bookedTill between :startDate and :endDate)) and (roomBooking.roomId=:requiredRoomId)";
//		
//		// for update service of room booking 
//		if(roomBooking.getBookingId()!=null){
//			queryStatement += " and (roomBooking.bookingId!=:requiredBookingId)";
//		}
//		
//		Query query = entityManager.createQuery(queryStatement);
//		query.setParameter("startDate", roomBooking.getBookedFrom());
//		query.setParameter("endDate", roomBooking.getBookedTill());
//		query.setParameter("requiredRoomId",roomBooking.getRoomId());
//	
//		// for update service of room booking 
//		if(roomBooking.getBookingId()!=null){
//			query.setParameter("requiredBookingId",roomBooking.getBookingId());
//		}
//		System.out.println(query.toString());
//		return query.getResultList();
//	}
	
//	private List<RoomBooking> searchRoomBookings(RoomBooking requestedRoomBooking){
//		String queryStatement = "from RoomBooking roombooking where ";
//		
//		boolean needToAddAnd;
//		
//		if(requestedRoomBooking.getRoomId()!=null){
//			queryStatement+= "roomBooking.roomId = "+requestedRoomBooking.getRoomId(); 
//		}
//		
//		if(requestedRoomBooking.getBookingTime()!=null){
//			queryStatement+= "roomBooking.bookingtime = "+requestedRoomBooking.getBookingTime();
//		}
//		
		
	}
