package com.example.FlavourFleet.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.FlavourFleet.Entities.iceCream;
import com.example.FlavourFleet.service.IceCreamServices.IceCreamServiceImple;


@RestController
public class iceCreamController {

	@Autowired
	IceCreamServiceImple obj;

	@PostMapping("/iceCream/addiceCream")
	public String addiceCream(@RequestBody List<iceCream> l) {
		return obj.addiceCream(l);
	}

	@GetMapping("/iceCream/getAlliceCream")
	public Iterable<iceCream> getAlliceCream() {
		return obj.getAlliceCream();
	}

	@DeleteMapping("/iceCream/deleteAlliceCream")
	public String deleteAlliceCream() {
		return deleteAlliceCream();
	}

	@DeleteMapping("/iceCream/deleteiceCreamItem/{id}")
	public String deleteiceCreamItem(@PathVariable int productId) {
		return deleteiceCreamItem(productId);
	}

}
