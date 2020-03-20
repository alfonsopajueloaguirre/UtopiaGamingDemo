package com.lcdd.backend.webControllers;

import java.util.Calendar;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


import com.lcdd.backend.dbrepositories.RoleRepository;
import com.lcdd.backend.dbrepositories.UserRepository;

import com.lcdd.backend.pojo.Role;
import com.lcdd.backend.pojo.User;

@Controller
public class InitController {
	
	@Autowired
	private RoleRepository roleRepository;
	
	
	@Autowired
	private UserRepository userRepository;
	
	
	
	@PostConstruct
	public void init() {
		
		
		Role presi= new Role("President");
		Role vice= new Role("Vice-president");
		roleRepository.save(new Role("ADMIN"));
		roleRepository.save(presi);
		roleRepository.save(vice);
		roleRepository.save(new Role("Secretary"));
		roleRepository.save(new Role("Treasurer"));
		roleRepository.save(new Role("Vocal"));
		
		
		

		
		
		//User user = new User("user", "pass", "ROLE_USER");
		//userRepository.save(user);
		User carlos = new User("email", "cPabe", "carlos", "pabe", "pass" , presi, "ROLE_ADMIN");
		User victor = new User("email", "ViktorLopezz", "vic", "lopz","pass", vice);
		userRepository.save(carlos);
		userRepository.save(victor);
		
		
		
		
		Calendar calendar = Calendar.getInstance();
		
		
		calendar.add(Calendar.MONTH, -11);
		
		
		
		calendar.add(Calendar.MONTH, +5);
		
		
		calendar.add(Calendar.MONTH, +5);
		
		calendar.add(Calendar.MONTH, +1);
		
	}
}
