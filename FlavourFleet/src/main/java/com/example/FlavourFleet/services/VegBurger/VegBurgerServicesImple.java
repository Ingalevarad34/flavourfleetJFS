package com.example.FlavourFleet.services.VegBurger;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.FlavourFleet.Entities.VegBurger;
import com.example.FlavourFleet.repositories.VegBurgerRepository;

@Service
public class VegBurgerServicesImple  implements VegBurgerServices{
	
	@Autowired
	VegBurgerRepository obj;
	
	public String addVegBurger(List<VegBurger>l) {
		obj.saveAll(l);
		return "Added all new Arrivals";
	}
	
	public Iterable<VegBurger>getAllVegBurger(){
		return obj.findAll();
	}
	
	public String deleteAllVegBurger() {
		obj.deleteAll();
		return "Deleted All Items";
		
	}

	public String deleteVegBurgerItem(int productId) {
		obj.deleteById(productId);
		return "Deleted the Item";
	}
	

}
