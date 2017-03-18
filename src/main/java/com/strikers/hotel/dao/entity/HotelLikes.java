package com.strikers.hotel.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="thotel_likes")
public class HotelLikes {

	@Id
	@Column(name="likes_id")
	private Long id;
	
	@Column(name="up_likes")
	private int upLikes;
	
	@Column(name="down_likes")
	private int downLikes;
		
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getUpLikes() {
		return upLikes;
	}
	public void setUpLikes(int upLikes) {
		this.upLikes = upLikes;
	}
	public int getDownLikes() {
		return downLikes;
	}
	public void setDownLikes(int downLikes) {
		this.downLikes = downLikes;
	}
	
	
	
}
