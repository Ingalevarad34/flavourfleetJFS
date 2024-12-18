package com.example.FlavourFleet.service.McDonanldServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FlavourFleet.Entities.mcDonanld;
import com.example.FlavourFleet.repositories.mcDonanldRepository;

@Service
public class McDonanldServiceImple implements McDonanldServices{

	@Autowired
	mcDonanldRepository obj;

	public String addmcDonanld(List<mcDonanld> l) {
		obj.saveAll(l);
		return "Added all veg biryani";
	}

	public Iterable<mcDonanld> getAllmcDonanld() {
		return obj.findAll();
	}

	public String deleteAllmcDonanld() {
		obj.deleteAll();
		return "Deleted all items";
	}

	public String deletemcDonanldItem(int productId) {
		obj.deleteById(productId);
		return "Deleted the item";
	}
}
