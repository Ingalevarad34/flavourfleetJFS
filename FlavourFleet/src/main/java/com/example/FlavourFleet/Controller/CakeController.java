package com.example.FlavourFleet.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.FlavourFleet.Entities.Cake;
import com.example.FlavourFleet.services.Cake.CakeServicesImple;

@RestController
public class CakeController {
	
	@Autowired
	CakeServicesImple obj;
	
	@PostMapping("/Cake/addCake")
	public String addCake(@RequestBody List<Cake>l) {
		return obj.addCake(l);
					
	}
	
	@GetMapping("/Cake/getAllCake")
	public Iterable<Cake>getAllCake(){
		return obj.getAllCake();
	}
	
	@DeleteMapping("/Cake/deleteAllCake")
	public String deleteAllCake() {
		return deleteAllCake();
	}


	@DeleteMapping("/Cake/deleteCakeItem/{id}")
	public String deleteCakeItem(@PathVariable int productId) {
		return deleteCakeItem(productId);
	}

}
