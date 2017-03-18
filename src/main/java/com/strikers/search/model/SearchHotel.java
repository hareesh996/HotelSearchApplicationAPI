package com.strikers.search.model;

import com.strikers.common.model.PaginationRequest;

public class SearchHotel extends PaginationRequest {
	
	private String searchName;
	private String searchlocation;
	private SortingItem sortingItem;
	
	public String getSearchName() {
		return searchName;
	}
	public void setSearchName(String searchName) {
		this.searchName = searchName;
	}
	public String getSearchlocation() {
		return searchlocation;
	}
	public void setSearchlocation(String searchlocation) {
		this.searchlocation = searchlocation;
	}
	public SortingItem getSortingItem() {
		return sortingItem;
	}
	public void setSortingItem(SortingItem sortingItem) {
		this.sortingItem = sortingItem;
	}
	
}
