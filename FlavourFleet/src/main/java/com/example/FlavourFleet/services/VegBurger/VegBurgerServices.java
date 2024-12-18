package com.example.FlavourFleet.services.VegBurger;

import java.util.List;

import com.example.FlavourFleet.Entities.VegBurger;

public interface VegBurgerServices {
	
	String addVegBurger(List<VegBurger> l);

	Iterable<VegBurger> getAllVegBurger();

	String deleteAllVegBurger();

	String deleteVegBurgerItem(int productId);

}
