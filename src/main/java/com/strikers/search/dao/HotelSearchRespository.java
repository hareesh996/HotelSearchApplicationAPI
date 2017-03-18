package com.strikers.search.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.strikers.hotel.dao.entity.Hotel;

public interface HotelSearchRespository extends PagingAndSortingRepository<Hotel, Long>{
	
	@Query("from thotel h where h.hotelName like :searchString or h.address.city.cityName like :searchString")
	public Page<Hotel> findHotels(@Param("searchString") String searchString,Pageable pageable);

}
