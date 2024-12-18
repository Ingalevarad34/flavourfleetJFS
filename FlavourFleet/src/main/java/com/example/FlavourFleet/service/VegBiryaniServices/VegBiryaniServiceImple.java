package com.example.FlavourFleet.service.VegBiryaniServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FlavourFleet.Entities.vegBiryani;
import com.example.FlavourFleet.repositories.VegBiryaniRepository;

@Service
public class VegBiryaniServiceImple implements VegBiryaniServices {

	@Autowired
	VegBiryaniRepository obj;

	public String addVegBiryani(List<vegBiryani> l) {
		obj.saveAll(l);
		return "Added all veg biryani";
	}

	public Iterable<vegBiryani> getAllVegBiryani() {
		return obj.findAll();
	}

	public String deleteAllVegBiryani() {
		obj.deleteAll();
		return "Deleted all items";
	}

	public String deleteVegBiryaniItem(int productId) {
		obj.deleteById(productId);
		return "Deleted the item";
	}

}
