package com.example.FlavourFleet.service.IceCreamServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FlavourFleet.Entities.iceCream;
import com.example.FlavourFleet.repositories.IceCreamRepository;

@Service
public class IceCreamServiceImple implements IceCreamServices {
	@Autowired
	IceCreamRepository obj;

	public String addiceCream(List<iceCream> l) {
		obj.saveAll(l);
		return "Added all veg biryani";
	}

	public Iterable<iceCream> getAlliceCream() {
		return obj.findAll();
	}

	public String deleteAlliceCream() {
		obj.deleteAll();
		return "Deleted all items";
	}

	public String deleteiceCreamItem(int productId) {
		obj.deleteById(productId);
		return "Deleted the item";
	}

}
