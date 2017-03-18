package com.strikers.hotel.model;

public class Hotel {
	
	private String name;
	private String hotelId;
	private Address location;
	private HotelLikes rating;
	private Price amount;
	private Long totalLikes;
	private String link;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHotelId() {
		return hotelId;
	}
	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}
	public Address getLocation() {
		return location;
	}
	public void setLocation(Address location) {
		this.location = location;
	}
	public HotelLikes getRating() {
		return rating;
	}
	public void setRating(HotelLikes rating) {
		this.rating = rating;
	}
	public Price getAmount() {
		return amount;
	}
	public void setAmount(Price amount) {
		this.amount = amount;
	}
	public Long getTotalLikes() {
		return totalLikes;
	}
	public void setTotalLikes(Long totalLikes) {
		this.totalLikes = totalLikes;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	
	
	
	
}
