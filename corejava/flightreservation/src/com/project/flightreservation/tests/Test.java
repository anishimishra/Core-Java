package com.project.flightreservation.tests;

import com.project.flightreservation.dao.ReservationDaoImpl;
import com.project.flightreservation.model.Passenger;
import com.project.flightreservation.model.Reservation;
import com.project.flightreservation.dao.ReservationDao;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReservationDao dao = new ReservationDaoImpl();
		Reservation reservation = new Reservation();
		Passenger passenger = new Passenger();
		passenger.setId(123l);
		passenger.setFirstName("Jon");
		passenger.setLastName("Bailey");
		passenger.setEmail("jo@ba.com");
		reservation.setPassenger(passenger);
		reservation.setFlightId(1l);
		Reservation savedReservation = dao
				.bookFlight(reservation);
		System.out.println(savedReservation);
		Reservation checkedIn = dao
				.checkIn(savedReservation
						.getId(), 2);
		System.out.println(checkedIn);
	}

}
