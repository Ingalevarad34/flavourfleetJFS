package com.example.FlavourFleet.services.VegRoll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.FlavourFleet.Entities.VegRoll;
import com.example.FlavourFleet.repositories.VegRollsRepository;

@Service
public class VegRollServicesImple  implements VegRollServices{
	
	@Autowired
	VegRollsRepository obj;
	
	
	public String addVegRoll(List<VegRoll>l) {
		obj.saveAll(l);
		return "Added all new Arrivals";
	}
	
	public Iterable<VegRoll>getAllVegRoll(){
		return obj.findAll();
	}
	
	public String deleteAllVegRoll() {
		obj.deleteAll();
		return "Deleted All Items";
		
	}

	public String deleteVegRollItem(int productId) {
		obj.deleteById(productId);
		return "Deleted the Item";
	}

}
