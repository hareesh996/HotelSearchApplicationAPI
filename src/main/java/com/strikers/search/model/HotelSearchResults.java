package com.strikers.search.model;

import java.util.List;

import com.strikers.common.model.PaginationResponse;
import com.strikers.hotel.model.Hotel;

public class HotelSearchResults extends PaginationResponse{

	private List<Hotel> listOfHotels;

	public List<Hotel> getListOfHotels() {
		return listOfHotels;
	}

	public void setListOfHotels(List<Hotel> listOfHotels) {
		this.listOfHotels = listOfHotels;
	}
	
}
