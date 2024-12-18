package com.example.FlavourFleet.service.VegBiryaniServices;

import java.util.List;

import com.example.FlavourFleet.Entities.vegBiryani;

public interface VegBiryaniServices {

	String addVegBiryani(List<vegBiryani> l);

	Iterable<vegBiryani> getAllVegBiryani();

	String deleteAllVegBiryani();

	String deleteVegBiryaniItem(int productId);

}
