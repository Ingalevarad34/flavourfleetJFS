package com.example.FlavourFleet.services.Cake;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FlavourFleet.Entities.Cake;

import com.example.FlavourFleet.repositories.CakeRepository;

@Service
public class CakeServicesImple implements CakeServices{
	
	@Autowired
	CakeRepository obj;

	public String addCake(List<Cake>l) {
		obj.saveAll(l);
		return "Added all cakes";
		
	}
	
	public Iterable<Cake>getAllCake(){
		return obj.findAll();
		
	}

	public String deleteAllCake() {
		obj.deleteAll();
		return "Deleted all items";
	}

	public String deleteCakeItem(int productId) {
		obj.deleteById(productId);
		return "Deleted the item";
	}

	@Override
	public Iterable<Cake> getCake() {
		// TODO Auto-generated method stub
		return null;
	}

}
