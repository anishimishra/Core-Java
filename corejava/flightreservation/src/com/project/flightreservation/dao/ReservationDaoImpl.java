package com.project.flightreservation.dao;

import java.util.HashMap;

import com.project.flightreservation.model.Flight;
import com.project.flightreservation.model.Reservation;

public class ReservationDaoImpl implements ReservationDao {
	HashMap<Long, Flight> flights;
	HashMap<Long, Reservation> reservations;
	long reservationId;

	public ReservationDaoImpl() {
		reservations = new HashMap<>();
		flights = new HashMap<>();
		Flight flight1 = new Flight();
		flight1.setId(1l);
		flight1.setFlightNumber("123");
		flight1.setOperatingAirlines("american");
		flight1.setDepartureCity("austin");
		flight1.setArrivalCity("NY");
		flight1.setDateAndTimeOfDeparture("5/22/2022 9PM");
		flights.put(flight1.getId(), flight1);
		Flight flight2 = new Flight();
		flight2.setId(2l);
		flight2.setFlightNumber("456");
		flight2.setOperatingAirlines("south west");
		flight2.setDepartureCity("denver");
		flight2.setArrivalCity("san diego");
		flight2.setDateAndTimeOfDeparture("6/22/2022 10PM");
		flights.put(flight2.getId(), flight2);
	}

	@Override
	public Reservation bookFlight(Reservation reservation) {
		// TODO Auto-generated method stub
		Flight flight = flights.get(reservation.getFlightId());
		reservation.setFlight(flight);
		reservationId = reservationId + 1;
		reservation.setId(reservationId);
		reservations.put(reservationId, reservation);
		return reservation;
	}

	@Override
	public Reservation checkIn(long reservationId, int noOfBags) {
		// TODO Auto-generated method stub
		Reservation reservation = reservations.get(reservationId);
		reservation.setNoOfBags(noOfBags);
		reservation.setCheckedIn(true);
		return reservation;
	}
}
