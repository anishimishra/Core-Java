package com.project.flightreservation.dao;

import com.project.flightreservation.model.Reservation;

public interface ReservationDao {
	Reservation bookFlight(Reservation reservation);

	Reservation checkIn(long reservationId, int noOfBags);
}
