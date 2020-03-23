package com.lcdd.backend.webControllers;



import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;




import com.lcdd.backend.pojo.User;

@Controller
public class InitController {


	
	
	
	@PostConstruct
	public void init() {
		
		//User user = new User("user", "pass", "ROLE_USER");
		//userRepository.save(user);
		User carlos = new User("email", "cPabe", "pass");
		User victor = new User("email", "ViktorLopezz","pass");		
	}
}
