package com.example.FlavourFleet.services.Paneer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.FlavourFleet.Entities.Paneer;
import com.example.FlavourFleet.repositories.PaneerRepository;


@Service
public  class PaneerServicesImple implements PaneerServices {
	
	@Autowired
	PaneerRepository obj;
	
	public String addPaneer(List<Paneer>l) {
		obj.saveAll(l);
		return "Added all items";
		
	}
	
	public Iterable<Paneer>getAllPaneer(){
		return obj.findAll();
		
	}

	public String deleteAllPaneer() {
		obj.deleteAll();
		return "Deleted all items";
	}

	public String deletePaneerItem(int productId) {
		obj.deleteById(productId);
		return "Deleted the item";
	}

	@Override
	public Iterable<Paneer> getPaneer() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
