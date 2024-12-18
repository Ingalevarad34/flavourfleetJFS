package com.example.FlavourFleet.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.FlavourFleet.Entities.burgerKing;
import com.example.FlavourFleet.service.BurgerKingServices.BurgerKingServiceImple;

@RestController
public class burgerKingController {
	@Autowired
	BurgerKingServiceImple obj;

	@PostMapping("/burgerKing/addburgerKing")
	public String addburgerKing(@RequestBody List<burgerKing> l) {
		return obj.addburgerKing(l);
	}

	@GetMapping("/burgerKing/getAllburgerKing")
	public Iterable<burgerKing> getAllburgerKing() {
		return obj.getAllburgerKing();
	}

	@DeleteMapping("/burgerKing/deleteAllburgerKing")
	public String deleteAllburgerKing() {
		return deleteAllburgerKing();
	}

	@DeleteMapping("/burgerKing/deleteburgerKingItem/{id}")
	public String deleteburgerKingItem(@PathVariable int productId) {
		return deleteburgerKingItem(productId);
	}
}
