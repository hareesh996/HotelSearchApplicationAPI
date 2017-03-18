package com.strikers.search.service.impl;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.dozer.Mapper;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import rx.Observable;
import rx.Subscriber;

import com.strikers.hotel.dao.entity.Hotel;
import com.strikers.search.dao.HotelSearchRespository;
import com.strikers.search.model.HotelSearchResults;
import com.strikers.search.model.SearchHotel;
import com.strikers.search.model.SearchStatus;
import com.strikers.search.service.HotelSearchService;

@Service
public class HotelSearchServiceImpl implements HotelSearchService{

	@Autowired
	private HotelSearchRespository repository;
	
	@Autowired
	BeanFactory beanFactory;
	
	@Override
	public Observable<HotelSearchResults> searchHotels(SearchHotel searchHotel) {
		
		
	Observable<HotelSearchResults> results = Observable.create(new Observable.OnSubscribe<HotelSearchResults>(){

			@Override
			public void call(Subscriber<? super HotelSearchResults> searchHotelSub) {
				String searchString  = searchHotel.getSearchName();
				// concate %%
				int pageNo = searchHotel.getPagaNo();
				int offset = searchHotel.getOffSet();
				searchString = "%".concat(searchString).concat("%");
				HotelSearchResults hotelSearchResults = null;
				Page<Hotel> hotels = repository.findHotels(searchString, new PageRequest(pageNo,offset));
				// convert list of hotels into HotelSearchResults.
				Mapper mapper = beanFactory.getBean(Mapper.class);
				List<com.strikers.hotel.model.Hotel> hotelDto = new ArrayList<com.strikers.hotel.model.Hotel>();
				Iterator<Hotel> resultsFromDao = hotels.iterator();
				while (resultsFromDao.hasNext()) {
					Hotel hotel = (Hotel) resultsFromDao.next();
					com.strikers.hotel.model.Hotel mappedObj  = mapper.map(hotel, com.strikers.hotel.model.Hotel.class,"HotelMapper");
					hotelDto.add(mappedObj);
				}
				hotelSearchResults = new HotelSearchResults();
				hotelSearchResults.setListOfHotels(hotelDto);
				searchHotelSub.onNext(hotelSearchResults);
			}
			
		}
		);
	
	return results;
		
	}

	@Override
	public Observable<SearchStatus> searchStatus(SearchHotel searchHotel) {
		
		return null;
	}

}
