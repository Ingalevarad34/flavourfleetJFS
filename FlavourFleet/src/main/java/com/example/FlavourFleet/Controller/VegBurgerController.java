package com.example.FlavourFleet.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.FlavourFleet.Entities.VegBurger;
import com.example.FlavourFleet.services.VegBurger.VegBurgerServicesImple;

@RestController
public class VegBurgerController  {
	
	@Autowired
	VegBurgerServicesImple obj;
	
	@PostMapping("/VegBurger/addVegBurger")
	public String addVegBurger(@RequestBody List<VegBurger>l) {
		return obj.addVegBurger(l);
	}

	@GetMapping("/VegBurger/getAllVegBurger")
	public Iterable<VegBurger>getAllVegBurger(){
		return obj.getAllVegBurger();
	}

	@DeleteMapping("/VegBurger/deleteAllVegBurger")
	public String deleteAllVegBurger() {
		return deleteAllVegBurger();
	}
	
	@DeleteMapping("/VegBurger/deleteVegBurgerItem{id}")
	public String deleteVegBurgerItem(@PathVariable int productID) {
		return deleteVegBurgerItem(productID);
	}

	
	

}
