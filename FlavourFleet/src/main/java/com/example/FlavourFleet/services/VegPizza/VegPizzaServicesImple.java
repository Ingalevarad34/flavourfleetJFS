package com.example.FlavourFleet.services.VegPizza;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FlavourFleet.Entities.VegPizza;
import com.example.FlavourFleet.repositories.VegPizzaRepository;

@Service
public class VegPizzaServicesImple implements VegPizzaServices {
	
	@Autowired
	VegPizzaRepository obj;
	
	public String addVegPizza(List<VegPizza>l) {
		obj.saveAll(l);
		return "Added all new Arrivals";
	}
	
	public Iterable<VegPizza>getAllVegPizza(){
		return obj.findAll();
	}

	public String deleteAllVegPizza() {
		obj.deleteAll();
		return "Deleted all Items";
		
	}

	public String deleteVegPizzaItem(int productId) {
		obj.deleteById(productId);
		return "Deleted the item";
	}

	
	

}
