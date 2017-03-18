package com.strikers.hotel.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "tcountry")
public class Country {
	
	@Id
	@Column(name="country_cd")
	private int countryCd;
	
	@Column(name="country_nm")
	private String coutryName;

	public int getCountryCd() {
		return countryCd;
	}

	public void setCountryCd(int countryCd) {
		this.countryCd = countryCd;
	}

	public String getCoutryName() {
		return coutryName;
	}

	public void setCoutryName(String coutryName) {
		this.coutryName = coutryName;
	}
	
}
