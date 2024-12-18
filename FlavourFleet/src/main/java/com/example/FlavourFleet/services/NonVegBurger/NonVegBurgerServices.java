package com.example.FlavourFleet.services.NonVegBurger;

import java.util.List;

import com.example.FlavourFleet.Entities.NonVegBurger;

public interface NonVegBurgerServices {
	

	String addNonVegBurger(List<NonVegBurger>l);
	Iterable<NonVegBurger> getAllNonVegBurger();

	String deleteAllNonVegBurger();

	String deleteNonVegBurgerItem(int productId);

}
