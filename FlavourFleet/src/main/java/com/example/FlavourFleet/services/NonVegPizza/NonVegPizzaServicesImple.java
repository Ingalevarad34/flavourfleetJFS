package com.example.FlavourFleet.services.NonVegPizza;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.FlavourFleet.Entities.NonVegPizza;
import com.example.FlavourFleet.repositories.NonVegPizzaRepository;

@Service
public class NonVegPizzaServicesImple  implements NonVegPizzaServices{
	
	@Autowired
	NonVegPizzaRepository obj;
	
	
	public String addNonVegPizza(List<NonVegPizza>l) {
		obj.saveAll(l);
		return "Added all new arrivals";
	}
	
	public Iterable<NonVegPizza>getAllNonVegPizza(){
		return obj.findAll();
	}

	public String deleteAllNonVegPizza() {
		obj.deleteAll();
		return "Deleted All items";
		
	}

	public String deleteNonVegPizzaItem(int productId) {
		obj.deleteById(productId);
		return "Deleted the item";
	}

	

}
