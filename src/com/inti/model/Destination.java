package com.inti.model;

public class Destination {
	public long idDestination;
	public long longitude;
	public long lattitude;
	
	public Hotel[] hotels;
	
	public void setHotel(Hotel[] hotels) {
		this.hotels=hotels;
	}
	public Hotel[] getHotel() {
		return hotels;
	}

}
