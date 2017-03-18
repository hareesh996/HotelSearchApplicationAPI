package com.strikers.search.model;

import java.util.List;

import com.strikers.hotel.model.Code;

public class SearchStatus {
	
	private int hotelCounts;
	private int totalLikes;
	private Double maxPrice;
	private Double minPrice;
	private List<Code> cities;
	
	public int getHotelCounts() {
		return hotelCounts;
	}
	public void setHotelCounts(int hotelCounts) {
		this.hotelCounts = hotelCounts;
	}
	public int getTotalLikes() {
		return totalLikes;
	}
	public void setTotalLikes(int totalLikes) {
		this.totalLikes = totalLikes;
	}
	public Double getMaxPrice() {
		return maxPrice;
	}
	public void setMaxPrice(Double maxPrice) {
		this.maxPrice = maxPrice;
	}
	public Double getMinPrice() {
		return minPrice;
	}
	public void setMinPrice(Double minPrice) {
		this.minPrice = minPrice;
	}
	public List<Code> getCities() {
		return cities;
	}
	public void setCities(List<Code> cities) {
		this.cities = cities;
	}
	
}
