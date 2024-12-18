package com.example.FlavourFleet.services.Cake;

import java.util.List;

import com.example.FlavourFleet.Entities.Cake;

public interface CakeServices {
	

	String addCake(List<Cake>l);
	Iterable<Cake> getCake();

	String deleteAllCake();

	String deleteCakeItem(int productId);

}
