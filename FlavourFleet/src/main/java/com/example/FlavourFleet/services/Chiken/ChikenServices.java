package com.example.FlavourFleet.services.Chiken;

import java.util.List;

import com.example.FlavourFleet.Entities.Chiken;

public interface ChikenServices {
	
	String addChicken(List<Chiken> l);

	Iterable<Chiken> getAllChicken();

	String deleteAllChicken();

	String deleteChickenItem(int productId);

}
