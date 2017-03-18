package com.strikers.hotel.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name="thotel_price")
public class HotelPrice {
	
	@Id
	@Column(name="hotel_price_id")
	private long id;
	
	@Column(name="total_amount")
	private Double totalAmount;
	
	@Column(name="desc_percentage")
	private Double discount;
	
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(referencedColumnName="currency_cd",name="currency_cd")
	private Currency currency;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}
	
	
	
}
