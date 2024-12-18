package com.example.FlavourFleet.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.FlavourFleet.Entities.NonVegChinese;
import com.example.FlavourFleet.services.NonVegChinese.NonVegChineseServicesImple;

@RestController
public class NonVegChineseController {
	
	@Autowired
	NonVegChineseServicesImple obj;
	
	
	@PostMapping("/NonvegChinese/addNonVegChinese")
	public String addNonVegChinese(@RequestBody List<NonVegChinese> l) {
		return obj.addNonVegChinese(l);
	}

	@GetMapping("/NonvegChinese/getAllNonVegChinese")
	public Iterable<NonVegChinese> getAllNonVegChinese() {
		return obj.getAllNonVegChinese();
	}

	@DeleteMapping("/NonvegChinese/deleteAllNonVegChinese")
	public String deleteAllNonVegChinese() {
		return deleteAllNonVegChinese();
	}

	@DeleteMapping("/NonvegChinese/deleteNonVegChineseItem/{id}")
	public String deleteNonVegChineseItem(@PathVariable int productId) {
		return deleteNonVegChineseItem(productId);
	}

}
