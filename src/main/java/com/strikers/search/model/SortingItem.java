package com.strikers.search.model;

public enum SortingItem {
	RATING("rating"),LIKE("like"),PRICE("price");
	
	private String identifier;
	
	private SortingItem(String identifier){
		this.identifier = identifier;
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
	
}
