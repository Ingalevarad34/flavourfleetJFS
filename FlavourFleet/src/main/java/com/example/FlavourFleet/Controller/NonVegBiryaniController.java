package com.example.FlavourFleet.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.FlavourFleet.Entities.NonVegBiryani;
import com.example.FlavourFleet.services.NonVegBiryani.NonVegBiryaniServiesImple;

@RestController
public class NonVegBiryaniController {
	
	@Autowired
	NonVegBiryaniServiesImple obj;
	
	@PostMapping("/NonvegBiryani/addNonVegBiryani")
	public String addNonVegBiryani(@RequestBody List<NonVegBiryani> l) {
		return obj.addNonVegBiryani(l);
	}

	@GetMapping("/NonvegBiryani/getAllNonVegBiryani")
	public Iterable<NonVegBiryani> getAllNonVegBiryani() {
		return obj.getAllNonVegBiryani();
	}

	@DeleteMapping("/NonvegBiryani/deleteAllNonVegBiryani")
	public String deleteAllNonVegBiryani() {
		return deleteAllNonVegBiryani();
	}

	@DeleteMapping("/NonvegBiryani/deleteNonVegBiryaniItem/{id}")
	public String deleteNonVegBiryaniItem(@PathVariable int productId) {
		return deleteNonVegBiryaniItem(productId);
	}

}
