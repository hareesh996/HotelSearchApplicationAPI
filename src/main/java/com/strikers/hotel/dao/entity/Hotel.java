package com.strikers.hotel.dao.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name="thotel")
public class Hotel {

	@Id
	@Column(name="hotel_id")
	private Long id;
	
	@Column(name = "hotel_nm")
	private String hotelName;
	
	@Column(name="link")
	private String link;
	
	@Column(name="image_path")
	private String img;
	
	//address_id
	@ManyToOne(fetch=FetchType.EAGER,cascade={CascadeType.PERSIST})
	@JoinColumn(name="address_id",referencedColumnName="address_id")
	private Address address;
	
	//hotel_likes
	@ManyToOne(fetch=FetchType.EAGER,cascade={CascadeType.PERSIST})
	@JoinColumn(name="hotel_likes",referencedColumnName="likes_id")
	private HotelLikes hotelLikes;
	
	//hotel_price_id
	@ManyToOne(fetch=FetchType.EAGER,cascade={CascadeType.PERSIST})
	@JoinColumn(name="hotel_price_id",referencedColumnName="hotel_price_id")
	private HotelPrice hotelPrice;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public HotelLikes getHotelLikes() {
		return hotelLikes;
	}

	public void setHotelLikes(HotelLikes hotelLikes) {
		this.hotelLikes = hotelLikes;
	}

	public HotelPrice getHotelPrice() {
		return hotelPrice;
	}

	public void setHotelPrice(HotelPrice hotelPrice) {
		this.hotelPrice = hotelPrice;
	}
	
}
