package com.example.FlavourFleet.service.DrinksServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FlavourFleet.Entities.Drinks;
import com.example.FlavourFleet.repositories.DrinksRepository;

@Service
public class DrinksServiceImple implements DrinksServices {

	@Autowired
	DrinksRepository obj;

	public String addDrinks(List<Drinks> l) {
		obj.saveAll(l);
		return "Added all Drinks";
	}

	public Iterable<Drinks> getAllDrinks() {
		return obj.findAll();
	}

	public String deleteAllDrinks() {
		obj.deleteAll();
		return "Deleted all items";
	}

	public String deleteDrinksItem(int productId) {
		obj.deleteById(productId);
		return "Deleted the item";
	}

}
