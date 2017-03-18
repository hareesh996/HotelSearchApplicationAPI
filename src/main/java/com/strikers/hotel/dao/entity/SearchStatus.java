package com.strikers.hotel.dao.entity;

import java.util.List;

import javax.persistence.Entity;

public class SearchStatus {
	
	private int totalHotelCount;
	private int totalLikes;
	private int maxPrice;
	private int minPrice;
	private List<String> listOfCities;
	public int getTotalHotelCount() {
		return totalHotelCount;
	}
	public void setTotalHotelCount(int totalHotelCount) {
		this.totalHotelCount = totalHotelCount;
	}
	public int getTotalLikes() {
		return totalLikes;
	}
	public void setTotalLikes(int totalLikes) {
		this.totalLikes = totalLikes;
	}
	public int getMaxPrice() {
		return maxPrice;
	}
	public void setMaxPrice(int maxPrice) {
		this.maxPrice = maxPrice;
	}
	public int getMinPrice() {
		return minPrice;
	}
	public void setMinPrice(int minPrice) {
		this.minPrice = minPrice;
	}
	public List<String> getListOfCities() {
		return listOfCities;
	}
	public void setListOfCities(List<String> listOfCities) {
		this.listOfCities = listOfCities;
	}
	
}
