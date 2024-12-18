package com.example.FlavourFleet.service.McDonanldServices;

import java.util.List;

import com.example.FlavourFleet.Entities.mcDonanld;

public interface McDonanldServices {
	String addmcDonanld(List<mcDonanld> l);

	Iterable<mcDonanld> getAllmcDonanld();

	String deleteAllmcDonanld();

	String deletemcDonanldItem(int productId);

}
