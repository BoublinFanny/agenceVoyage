package com.inti.model;

public class Avis {
	public long idAvis;
	public String commentaire;
	
public Hotel hotel;
	
	public void setHotel(Hotel hotel) {
		this.hotel=hotel;
	}
	public Hotel getHotel() {
		return hotel;
	}
}
