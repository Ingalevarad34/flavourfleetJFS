package com.example.FlavourFleet.services.NonVegPizza;

import java.util.List;

import com.example.FlavourFleet.Entities.NonVegPizza;

public interface NonVegPizzaServices {
	
	String addNonVegPizza(List<NonVegPizza> l);

	Iterable<NonVegPizza> getAllNonVegPizza();

	String deleteAllNonVegPizza();

	String deleteNonVegPizzaItem(int productId);


}
