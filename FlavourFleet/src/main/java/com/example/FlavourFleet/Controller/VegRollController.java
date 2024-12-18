package com.example.FlavourFleet.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.FlavourFleet.Entities.VegRoll;
import com.example.FlavourFleet.services.VegRoll.VegRollServicesImple;

@RestController
public class VegRollController {
	
	@Autowired
	VegRollServicesImple obj;
	
	@PostMapping("/VegRoll/addVegRoll")
	public String addVegRoll(@RequestBody List<VegRoll>l) {
		return obj.addVegRoll(l);
	}

	@GetMapping("/VegRoll/getAllVegRoll")
	public Iterable<VegRoll>getAllVegRoll(){
		return obj.getAllVegRoll();
	}

	@DeleteMapping("/VegRoll/deleteAllVegRoll")
	public String deleteAllVegRoll() {
		return deleteAllVegRoll();
	}
	
	@DeleteMapping("/VegRoll/deleteVegRollItem{id}")
	public String deleteVegRollItem(@PathVariable int productID) {
		return deleteVegRollItem(productID);
	}


}
