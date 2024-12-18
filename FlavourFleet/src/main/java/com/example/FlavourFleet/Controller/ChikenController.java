package com.example.FlavourFleet.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.FlavourFleet.Entities.Chiken;
import com.example.FlavourFleet.services.Chiken.ChikenServicesImple;

@RestController
public class ChikenController {
	
	@Autowired
	ChikenServicesImple obj;
	
	@PostMapping("/chicken/addChicken")
	public String addChicken(@RequestBody List<Chiken>l) {
		return obj.addChicken(l);
					
	}
	
	@GetMapping("/chicken/getAllChicken")
	public Iterable<Chiken>getAllChicken(){
		return obj.getAllChicken();
	}
	
	@DeleteMapping("/Cake/deleteAllChicken")
	public String deleteAllChicken() {
		return deleteAllChicken();
	}


	@DeleteMapping("/Cake/deleteChickenItem/{id}")
	public String deleteChickenItem(@PathVariable int productId) {
		return deleteChickenItem(productId);
	}
	

}
