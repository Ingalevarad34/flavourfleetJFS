package com.example.FlavourFleet.services.VegChinese;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.FlavourFleet.Entities.VegChinese;
import com.example.FlavourFleet.repositories.VegChineseRepository;

@Service
public class VegChineseServicesImple implements VegChineseServices {
	@Autowired
	VegChineseRepository obj;
	
	public String addVegChinese(List<VegChinese>l) {
		obj.saveAll(l);
		return "Added all new Arrivals";
	}
	
	public Iterable<VegChinese>getAllVegChinese(){
		return obj.findAll();
	}
	
	public String deleteAllVegChinese() {
		obj.deleteAll();
		return "Deleted All Items";
		
	}

	public String deleteVegChineseItem(int productId) {
		obj.deleteById(productId);
		return "Deleted the Item";
	}
	

}
