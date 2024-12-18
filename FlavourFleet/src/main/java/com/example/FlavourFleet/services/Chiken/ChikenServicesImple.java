package com.example.FlavourFleet.services.Chiken;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FlavourFleet.Entities.Chiken;
import com.example.FlavourFleet.repositories.ChikenRepository;


@Service
public class ChikenServicesImple implements ChikenServices{
	
	@Autowired
	ChikenRepository obj;
	
	
	public String addChicken(List<Chiken>l) {
		obj.saveAll(l);
		return "Added all new arrivals";
	}
	
	public Iterable<Chiken>getAllChicken(){
		return obj.findAll();
	}

	public String deleteAllChicken() {
		 obj.deleteAll();
		return "Deleted all items";
	}


	public  String deleteChickenItem(int productId) {
		obj.deleteById(productId);
		return "Deleted the item";
	}
	

}
