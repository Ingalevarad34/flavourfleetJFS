package com.example.FlavourFleet.services.NonVegBiryani;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FlavourFleet.Entities.NonVegBiryani;
import com.example.FlavourFleet.repositories.NonVegBiryaniRepository;

@Service
public class NonVegBiryaniServiesImple {
	
	@Autowired
	NonVegBiryaniRepository obj;

	public String addNonVegBiryani(List<NonVegBiryani> l) {
		obj.saveAll(l);
		return "Added all new arrivals";
	}

	public Iterable<NonVegBiryani> getAllNonVegBiryani() {
		return obj.findAll();
	}

	public String deleteAllNonVegBiryani() {
		obj.deleteAll();
		return "Deleted all items";
	}

	public String deleteNonVegBiryaniItem(int productId) {
		obj.deleteById(productId);
		return "Deleted the item";
	}

}
