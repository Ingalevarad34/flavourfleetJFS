package com.example.FlavourFleet.services.NonVegBurger;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.FlavourFleet.Entities.NonVegBurger;
import com.example.FlavourFleet.repositories.NonVegBurgerRepository;

@Service
public class NonVegBurgerServicesImple implements NonVegBurgerServices {
	
	@Autowired
	NonVegBurgerRepository obj;

	public String addNonVegBurger(List<NonVegBurger>l) {
		obj.saveAll(l);
		return "Added all cakes";
		
	}
	
	public Iterable<NonVegBurger>getAllNonVegBurger(){
		return obj.findAll();
		
	}

	public String deleteAllNonVegBurger() {
		obj.deleteAll();
		return "Deleted all items";
	}

	public String deleteNonVegBurgerItem(int productId) {
		obj.deleteById(productId);
		return "Deleted the item";
	}


}
