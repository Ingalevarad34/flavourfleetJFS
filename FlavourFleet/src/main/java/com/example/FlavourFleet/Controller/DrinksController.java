package com.example.FlavourFleet.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.FlavourFleet.Entities.Drinks;
import com.example.FlavourFleet.service.DrinksServices.DrinksServiceImple;

@RestController
public class DrinksController {
	
	@Autowired
	DrinksServiceImple obj;
	

	@PostMapping("/Drinks/addDrinks")
	public String addDrinks(@RequestBody List<Drinks>l) {
		return obj.addDrinks(l);
					
	}
	
	@GetMapping("/Drinks/getAllDrinks")
	public Iterable<Drinks>getAllDrinks(){
		return obj.getAllDrinks();
	}
	
	@DeleteMapping("/Drinks/deleteAllDrinks")
	public String deleteAllDrinks() {
		return deleteAllDrinks();
	}


	@DeleteMapping("/Drinks/deleteDrinksItem/{id}")
	public String deleteDrinksItem(int productId) {
		return deleteDrinksItem(productId);
	}


}
