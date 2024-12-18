package com.example.FlavourFleet.services.NonVegRoll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.FlavourFleet.Entities.NonVegRoll;
import com.example.FlavourFleet.repositories.NonVegRollRepository;

@Service
public class NonVegRollServicesImple implements NonVegRollServices{
	
	@Autowired
	NonVegRollRepository obj;
	
	public String addNonVegRoll(List<NonVegRoll> l) {
		obj.saveAll(l);
		return "Added all new arrivals";
	}

	public Iterable<NonVegRoll> getAllNonVegRoll() {
		return obj.findAll();
	}

	public String deleteAllNonVegRoll() {
		obj.deleteAll();
		return "Deleted all items";
	}

	public String deleteNonVegRollItem(int productId) {
		obj.deleteById(productId);
		return "Deleted the item";
	}


}
