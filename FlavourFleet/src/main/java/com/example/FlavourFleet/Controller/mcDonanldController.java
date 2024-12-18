package com.example.FlavourFleet.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.FlavourFleet.Entities.mcDonanld;
import com.example.FlavourFleet.service.McDonanldServices.McDonanldServiceImple;

@RestController
public class mcDonanldController {
	@Autowired
	McDonanldServiceImple obj;

	@PostMapping("/mcDonanld/addmcDonanld")
	public String addmcDonanld(@RequestBody List<mcDonanld> l) {
		return obj.addmcDonanld(l);
	}

	@GetMapping("/mcDonanld/getAllmcDonanld")
	public Iterable<mcDonanld> getAllmcDonanld() {
		return obj.getAllmcDonanld();
	}

	@DeleteMapping("/mcDonanld/deleteAllmcDonanld")
	public String deleteAllmcDonanld() {
		return deleteAllmcDonanld();
	}

	@DeleteMapping("/mcDonanld/deletemcDonanldItem/{id}")
	public String deletemcDonanldItem(@PathVariable int productId) {
		return deletemcDonanldItem(productId);
	}
}
