package com.example.FlavourFleet.service.KfcServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FlavourFleet.Entities.kfc;
import com.example.FlavourFleet.repositories.kfcRepository;

@Service
public class KfcServiceImple implements KfcServices{

	@Autowired
	kfcRepository obj;

	public String addkfc(List<kfc> l) {
		obj.saveAll(l);
		return "Added all veg biryani";
	}

	public Iterable<kfc> getAllkfc() {
		return obj.findAll();
	}

	public String deleteAllkfc() {
		obj.deleteAll();
		return "Deleted all items";
	}

	public String deletekfcItem(int productId) {
		obj.deleteById(productId);
		return "Deleted the item";
	}
}
