package com.inti.model;

import java.util.Date;

public class Reservation {
	public long idVoyageur;
	public Date dateReservation;
	public int nbrJour;
	
public Hotel hotel;
	
	public void setHotel(Hotel hotel) {
		this.hotel=hotel;
	}
	public Hotel getHotel() {
		return hotel;
	}
	
	
public Voyageur voyageur;
	
	public void setVoyageur(Voyageur voyageur) {
		this.voyageur=voyageur;
	}
	public Voyageur getVoyageur() {
		return voyageur;
	}
}
