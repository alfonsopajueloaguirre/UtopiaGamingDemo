package com.lcdd.backend.webControllers;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.lcdd.backend.UserSession;
import com.lcdd.backend.pojo.RegisterDataForm;
import com.lcdd.backend.pojo.User;

@Controller
public class LoginRegisterController {

	@Autowired 
	public UserSession userSession;
	
	
	@PostMapping(value = {"/registerUser"})
	public String registerUser(Model model, RegisterDataForm user) {
		
		User newUser = new User(user.getEmail(),user.getName(),user.getPassword());
		
		userSession.setUsername(newUser.getName());
		
		return "/";
	}
	
	@RequestMapping(value= {"/loginUser"})
	public String loginUser(Model model, RegisterDataForm user) {
		
		return "/";
		
	}
	
}
