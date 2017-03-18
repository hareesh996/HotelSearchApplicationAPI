package com.strikers.hotel.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="tcurrency")
public class Currency {
	
	@Id
	@Column(name="currency_cd")
	private long currencyCd;
	
	@Column(name="currency_nm")
	private String currenyName;
	
	public long getCurrencyCd() {
		return currencyCd;
	}
	public void setCurrencyCd(long currencyCd) {
		this.currencyCd = currencyCd;
	}
	public String getCurrenyName() {
		return currenyName;
	}
	public void setCurrenyName(String currenyName) {
		this.currenyName = currenyName;
	}
	
}
