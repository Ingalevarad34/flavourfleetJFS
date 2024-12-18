package com.example.FlavourFleet.service.DrinksServices;

import java.util.List;

import com.example.FlavourFleet.Entities.Drinks;

public interface DrinksServices {
	String addDrinks(List<Drinks> l);

	Iterable<Drinks> getAllDrinks();

	String deleteAllDrinks();

	String deleteDrinksItem(int productId);
}
