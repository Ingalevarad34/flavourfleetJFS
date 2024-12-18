package com.example.FlavourFleet.service.IceCreamServices;

import java.util.List;

import com.example.FlavourFleet.Entities.iceCream;

public interface IceCreamServices {
	String addiceCream(List<iceCream> l);

	Iterable<iceCream> getAlliceCream();

	String deleteAlliceCream();

	String deleteiceCreamItem(int productId);
}
