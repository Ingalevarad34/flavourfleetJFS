package com.example.FlavourFleet.services.NonVegRoll;

import java.util.List;

import com.example.FlavourFleet.Entities.NonVegRoll;

public interface NonVegRollServices {
	
	String addNonVegRoll(List<NonVegRoll> l);

	Iterable<NonVegRoll> getAllNonVegRoll();

	String deleteAllNonVegRoll();

	String deleteNonVegRollItem(int productId);

}
