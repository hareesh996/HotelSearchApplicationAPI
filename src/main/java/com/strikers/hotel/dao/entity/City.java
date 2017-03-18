package com.strikers.hotel.dao.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name="tcity")
public class City {
	
	@Id
	@Column(name="city_cd")
	private int cityId;
	
	@Column(name="city_nm")
	private String cityName;

	@Column(name="state_nm")
	private String state;
	
	@OneToOne(fetch=FetchType.EAGER,cascade={CascadeType.PERSIST})
	@JoinColumn(name="country_cd",referencedColumnName="country_cd")
	private Country country;
	
	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	
	
}
