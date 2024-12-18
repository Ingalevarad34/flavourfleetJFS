package com.example.FlavourFleet.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.FlavourFleet.Entities.Paneer;
import com.example.FlavourFleet.services.Paneer.PaneerServicesImple;


@RestController
public class PannerController {
	
	@Autowired
	PaneerServicesImple obj;
	
	@PostMapping("/Paneer/addPaneer")
	public String addPaneer(@RequestBody List<Paneer>l) {
		return obj.addPaneer(l);
					
	}
	
	@GetMapping("/Paneer/getAllPaneer")
	public Iterable<Paneer>getAllPaneer(){
		return obj.getAllPaneer();
	}
	
	@DeleteMapping("/Paneer/deleteAllPaneer")
	public String deleteAllPaneer() {
		return deleteAllPaneer();
	}


	@DeleteMapping("/Paneer/deletePaneerItem/{id}")
	public String deletePaneerItem(int productId) {
		return deletePaneerItem(productId);
	}
	
	

}
