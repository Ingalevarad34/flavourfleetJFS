package com.example.FlavourFleet.service.BurgerKingServices;

import java.util.List;

import com.example.FlavourFleet.Entities.burgerKing;

public interface BurgerKingServices {
	String addburgerKing(List<burgerKing> l);

	Iterable<burgerKing> getAllburgerKing();

	String deleteAllburgerKing();

	String deleteburgerKingItem(int productId);

}
