package com.example.FlavourFleet.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.FlavourFleet.Entities.VegChinese;
import com.example.FlavourFleet.services.VegChinese.VegChineseServicesImple;

@RestController
public class VegChineseController {
	@Autowired
	VegChineseServicesImple obj;
	
	@PostMapping("/VegChinese/addVegChinese")
	public String addVegChinese(@RequestBody List<VegChinese>l) {
		return obj.addVegChinese(l);
	}

	@GetMapping("/VegChinese/getAllVegChinese")
	public Iterable<VegChinese>Chinese(){
		return obj.getAllVegChinese();
	}

	@DeleteMapping("/VegChinese/deleteAllVegChinese")
	public String deleteAllVegChinese() {
		return deleteAllVegChinese();
	}
	
	@DeleteMapping("/VegChinese/deleteVegChineseItem{id}")
	public String deleteVegChineseItem(@PathVariable int productID) {
		return deleteVegChineseItem(productID);
	}
	
	

}
