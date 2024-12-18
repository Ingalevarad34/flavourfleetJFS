package com.example.FlavourFleet.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.FlavourFleet.Entities.vegBiryani;
import com.example.FlavourFleet.service.VegBiryaniServices.VegBiryaniServiceImple;

@RestController
public class VegBiryaniController {

	@Autowired
	VegBiryaniServiceImple obj;

	@PostMapping("/vegBiryani/addVegBiryani")
	public String addVegBiryani(@RequestBody List<vegBiryani> l) {
		return obj.addVegBiryani(l);
	}

	@GetMapping("/vegBiryani/getAllVegBiryani")
	public Iterable<vegBiryani> getAllVegBiryani() {
		return obj.getAllVegBiryani();
	}

	@DeleteMapping("/vegBiryani/deleteAllVegBiryani")
	public String deleteAllVegBiryani() {
		return deleteAllVegBiryani();
	}

	@DeleteMapping("/vegBiryani/deleteVegBiryaniItem/{id}")
	public String deleteVegBiryaniItem(@PathVariable int productId) {
		return deleteVegBiryaniItem(productId);
	}

}
