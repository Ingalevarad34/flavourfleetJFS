package com.example.FlavourFleet.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.FlavourFleet.Entities.SignUp;
import com.example.FlavourFleet.service.SignUp.SignUpServiceImple;

@RestController
public class SignUpController {
	@Autowired
	SignUpServiceImple obj;
	
	@PostMapping("signUp/addSignUp")
	public String addSignUp(@RequestBody List<SignUp> s) {
		return obj.addSignUp(s);
	}
}
