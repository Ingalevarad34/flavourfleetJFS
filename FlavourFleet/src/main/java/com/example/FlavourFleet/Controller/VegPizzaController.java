package com.example.FlavourFleet.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.FlavourFleet.Entities.VegPizza;
import com.example.FlavourFleet.services.VegPizza.VegPizzaServicesImple;

@RestController
public class VegPizzaController {
	
	@Autowired
	VegPizzaServicesImple obj;
	
	
	@PostMapping("/VegPizza/addVegPizza")
	public String addVegPizza(@RequestBody List<VegPizza>l) {
		return obj.addVegPizza(l);
	}

	@GetMapping("/VegPizza/getAllVegPizza")
		public Iterable<VegPizza>getAllVegPizza(){
			return obj.getAllVegPizza();
		}
	
	@DeleteMapping("/VegPizza/deleteAllVegPizza")
	public String deleteAllVegPizza() {
		return deleteAllVegPizza();
	}

	@DeleteMapping("/VegPizza/deleteVegPizzaItem/{id}")
	public String deleteVegPizzaItem(@PathVariable int productId) {
		return deleteVegPizzaItem(productId);
	}


	

}
