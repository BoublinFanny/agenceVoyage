package com.inti.model;

public class Voyageur {
	public long idVoyageur ;
	public String nom;
	public String prenom;
	public int age;
	
public Reservation[] reservation;
	
	public void setReservation(Reservation[] reservation) {
		this.reservation=reservation;
	}
	public Reservation[] getReservation() {
		return reservation;
	}
}
