package com.example.FlavourFleet.service.SignUp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.FlavourFleet.Entities.SignUp;
import com.example.FlavourFleet.repositories.SignUpRepository;

@Service
public class SignUpServiceImple implements SignUpServices {
	@Autowired
	SignUpRepository obj;

	public String addSignUp(@RequestBody List<SignUp> s) {
		obj.saveAll(s);
		return "User added successfully";
	}
}
