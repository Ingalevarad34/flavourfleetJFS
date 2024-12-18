package com.example.FlavourFleet.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.FlavourFleet.Entities.NonVegBurger;
import com.example.FlavourFleet.services.NonVegBurger.NonVegBurgerServicesImple;

@RestController
public class NonVegBurgerController {
	
	@Autowired
	NonVegBurgerServicesImple obj;
	
	@PostMapping("/NonvegBurger/addNonVegBurger")
	public String addNonVegBurger(@RequestBody List<NonVegBurger> l) {
		return obj.addNonVegBurger(l);
	}

	@GetMapping("/NonvegBurger/getAllNonVegBurger")
	public Iterable<NonVegBurger> getAllNonVegBurger() {
		return obj.getAllNonVegBurger();
	}

	@DeleteMapping("/NonvegBurger/deleteAllNonVegBurger")
	public String deleteAllNonVegBurger() {
		return deleteAllNonVegBurger();
	}

	@DeleteMapping("/NonvegBurger/deleteNonVegBurgerItem/{id}")
	public String deleteNonVegBurgerItem(@PathVariable int productId) {
		return deleteNonVegBurgerItem(productId);
	}

}
