package com.example.FlavourFleet.services.NonVegChinese;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.FlavourFleet.Entities.NonVegChinese;
import com.example.FlavourFleet.repositories.NonVegChineseRepository;



@Service
public class NonVegChineseServicesImple implements NonVegChineseServices {
	
	@Autowired
	NonVegChineseRepository obj;
	
	public String addNonVegChinese(List<NonVegChinese> l) {
		obj.saveAll(l);
		return "Added all new arrivals";
	}

	public Iterable<NonVegChinese> getAllNonVegChinese() {
		return obj.findAll();
	}

	public String deleteAllNonVegChinese() {
		obj.deleteAll();
		return "Deleted all items";
	}

	public String deleteNonVegChineseItem(int productId) {
		obj.deleteById(productId);
		return "Deleted the item";
	}

	



}
