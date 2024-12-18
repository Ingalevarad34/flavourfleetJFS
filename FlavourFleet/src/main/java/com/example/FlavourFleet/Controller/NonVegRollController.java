package com.example.FlavourFleet.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.FlavourFleet.Entities.NonVegRoll;
import com.example.FlavourFleet.services.NonVegRoll.NonVegRollServicesImple;

@RestController
public class NonVegRollController {
	
	@Autowired
	NonVegRollServicesImple obj;
	
	@PostMapping("/NonvegRoll/addNonVegRoll")
	public String addNonVegRoll(@RequestBody List<NonVegRoll> l) {
		return obj.addNonVegRoll(l);
	}

	@GetMapping("/NonvegRoll/getAllNonVegRoll")
	public Iterable<NonVegRoll> getAllNonVegRoll() {
		return obj.getAllNonVegRoll();
	}

	@DeleteMapping("/NonvegRoll/deleteAllNonVegRoll")
	public String deleteAllNonVegRoll() {
		return deleteAllNonVegRoll();
	}

	@DeleteMapping("/NonvegRoll/deleteNonVegRollItem/{id}")
	public String deleteNonVegRollItem(@PathVariable int productId) {
		return deleteNonVegRollItem(productId);
	}

}
