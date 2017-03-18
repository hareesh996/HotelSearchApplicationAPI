package com.strikers;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.strikers.search.resource.HotelSearhResource;

@Component
@ApplicationPath("/hotel")
public class HotelResourceConfig extends ResourceConfig{

	public HotelResourceConfig(){
		register(HotelSearhResource.class);
	}
	
}
