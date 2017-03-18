package com.strikers.hotel.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name="taddress")
public class Address {

	@Id
	@Column(name="address_id")
	private long addressId;
	
	@Column(name="address_tx_1")
	private String addressText1;
	
	@Column(name="address_tx_2")
	private String addressText2;
	
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(referencedColumnName="city_cd",name="city_cd")
	private City city;

	public long getAddressId() {
		return addressId;
	}

	public void setAddressId(long addressId) {
		this.addressId = addressId;
	}

	public String getAddressText1() {
		return addressText1;
	}

	public void setAddressText1(String addressText1) {
		this.addressText1 = addressText1;
	}

	public String getAddressText2() {
		return addressText2;
	}

	public void setAddressText2(String addressText2) {
		this.addressText2 = addressText2;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}
	
}
