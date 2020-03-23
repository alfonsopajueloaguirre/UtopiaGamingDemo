package com.lcdd.backend.webControllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lcdd.backend.UserSession;

import com.lcdd.backend.pojo.RegisterDataForm;


@Controller
public class ProfileController {

	@Autowired
	private UserSession session;
	
	
	
	
	@RequestMapping(value = {"/profile"}, 
			method = RequestMethod.POST)
	public String editUser(Model model, RegisterDataForm user) {
		
		session.setEmail(user.getEmail());

			
		return "profile";
	}
	
	
	
	
}
