package com.example.FlavourFleet.services.VegPizza;

import java.util.List;

import com.example.FlavourFleet.Entities.VegPizza;


public interface VegPizzaServices {
	
	String addVegPizza(List<VegPizza> l);

	Iterable<VegPizza> getAllVegPizza();

	String deleteAllVegPizza();

	String deleteVegPizzaItem(int productId);

}
