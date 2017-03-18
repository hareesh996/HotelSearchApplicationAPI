package com.strikers.search.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import rx.functions.Action1;
import rx.schedulers.Schedulers;

import com.strikers.search.dao.HotelSearchRespository;
import com.strikers.search.model.HotelSearchResults;
import com.strikers.search.model.SearchHotel;
import com.strikers.search.service.HotelSearchService;


@Controller
@Path("/hotelsearch")
public class HotelSearhResource {

	@Autowired
	private HotelSearchService hotelSearchSvc;
	
	@Autowired
	private HotelSearchRespository repository;
	
	@POST
	@Path("/status")
	@Consumes(value={MediaType.APPLICATION_JSON})
	@Produces(value={MediaType.APPLICATION_JSON})
	public void searchHotelStatus(SearchHotel searchHotel,@Suspended AsyncResponse asyncResponse){
		
		hotelSearchSvc.searchHotels(searchHotel).subscribeOn(Schedulers.io()).observeOn(Schedulers.computation()).subscribe(new Action1<HotelSearchResults>() {
			@Override
			public void call(HotelSearchResults hotelSearch) {
				asyncResponse.resume(hotelSearch);
			}
		},new Action1<Throwable>() {
			
			@Override
			public void call(Throwable arg0) {
				asyncResponse.resume(arg0);
			}
		});
	}
	
	@POST
	@Path("/search")
	public void searchHotel(SearchHotel searchHotel, @Suspended AsyncResponse asyncResponse){
		hotelSearchSvc.searchHotels(searchHotel);
	}
	
}
