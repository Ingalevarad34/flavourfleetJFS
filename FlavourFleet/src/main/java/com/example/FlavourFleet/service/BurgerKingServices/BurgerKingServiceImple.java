package com.example.FlavourFleet.service.BurgerKingServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FlavourFleet.Entities.burgerKing;
import com.example.FlavourFleet.repositories.burgerKingRepository;

@Service
public class BurgerKingServiceImple implements BurgerKingServices{


	@Autowired
	burgerKingRepository obj;

	public String addburgerKing(List<burgerKing> l) {
		obj.saveAll(l);
		return "Added all veg biryani";
	}

	public Iterable<burgerKing> getAllburgerKing() {
		return obj.findAll();
	}

	public String deleteAllburgerKing() {
		obj.deleteAll();
		return "Deleted all items";
	}

	public String deleteburgerKingItem(int productId) {
		obj.deleteById(productId);
		return "Deleted the item";
	}
}
