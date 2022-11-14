package com.inti.model;

public class Hotel {
	public long idHotel;
	public String nom;
	public int nbEtoile;
	
	public Destination destination;
	
	public void setDestination(Destination destination) {
		this.destination=destination;
	}
	public Destination getDestination() {
		return destination;
	}

public Reservation[] reservation;
	
	public void setReservation(Reservation[] reservation) {
		this.reservation=reservation;
	}
	public Reservation[] getReservation() {
		return reservation;
	}
	
	
public Avis[] avis;
	
	public void setAvis(Avis[] avis) {
		this.avis=avis;
	}
	public Avis[] getAvis() {
		return avis;
	}
}
