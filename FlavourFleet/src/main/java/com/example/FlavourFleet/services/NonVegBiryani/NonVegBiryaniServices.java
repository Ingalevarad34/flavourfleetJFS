package com.example.FlavourFleet.services.NonVegBiryani;

import java.util.List;

import com.example.FlavourFleet.Entities.NonVegBiryani;


public interface NonVegBiryaniServices {
	
	String addNonVegBiryani(List<NonVegBiryani> l);

	Iterable<NonVegBiryani> getAllNonVegBiryani();

	String deleteAllNonVegBiryani();

	String deleteNonVegBiryaniItem(int productId);

}
