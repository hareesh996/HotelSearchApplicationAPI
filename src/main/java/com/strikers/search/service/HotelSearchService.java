package com.strikers.search.service;

import rx.Observable;

import com.strikers.search.model.HotelSearchResults;
import com.strikers.search.model.SearchHotel;
import com.strikers.search.model.SearchStatus;


public interface HotelSearchService {

	/**
	 *  Search the hotels based on <code>searchHotel</code>.
	 * @param searchHotel
	 * @return
	 */
	public Observable<HotelSearchResults> searchHotels(SearchHotel searchHotel);
	
	
	public Observable<SearchStatus> searchStatus(SearchHotel searchHotel);
	
}
