package com.example.FlavourFleet.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.FlavourFleet.Entities.kfc;
import com.example.FlavourFleet.service.KfcServices.KfcServiceImple;

@RestController
public class KfcController {

	@Autowired
	KfcServiceImple obj;

	@PostMapping("/kfc/addkfc")
	public String addkfc(@RequestBody List<kfc> l) {
		return obj.addkfc(l);
	}

	@GetMapping("/kfc/getAllkfc")
	public Iterable<kfc> getAllkfc() {
		return obj.getAllkfc();
	}

	@DeleteMapping("/kfc/deleteAllkfc")
	public String deleteAllkfc() {
		return deleteAllkfc();
	}

	@DeleteMapping("/kfc/deletekfcItem/{id}")
	public String deletekfcItem(@PathVariable int productId) {
		return deletekfcItem(productId);
	}

}
