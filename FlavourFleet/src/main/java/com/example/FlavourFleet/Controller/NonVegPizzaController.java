package com.example.FlavourFleet.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.FlavourFleet.Entities.NonVegPizza;
import com.example.FlavourFleet.services.NonVegPizza.NonVegPizzaServicesImple;

@RestController
public class NonVegPizzaController {
	
	@Autowired
	NonVegPizzaServicesImple obj;
	
	@PostMapping("/NonVegPizza/addNonVegPizza")
	public String addNonVegPizza(@RequestBody List<NonVegPizza>l) {
		return obj.addNonVegPizza(l);
		
	}
	
	@GetMapping("/NonVegPizza/getAllNonVegPizza")
	public Iterable<NonVegPizza>getAllNonVegPizza(){
		return obj.getAllNonVegPizza();
	}

	@DeleteMapping("/NonVegPizza/deleteAllNonVegPizza")
	public String deleteAllNonVegPizza() {
		return deleteAllNonVegPizza();
	}

	@DeleteMapping("/NonVegPizza/deleteNonVegPizzaItem{id}")
	public String deleteNonVegPizzaItem(@PathVariable int productId) {
		return deleteNonVegPizzaItem(productId);
		
	}
	


}
