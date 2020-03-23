package es.ipo.app;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import es.ipo.app.RegisterDataForm;
import es.ipo.app.User;
import es.ipo.app.UserSession;

@Controller
public class LoginRegisterController {

	@Autowired 
	public UserSession userSession;
	
	@GetMapping("/")
	public String tablon(Model model, HttpSession session) {

		return "/loginRegister";
	}
	
	@PostMapping(value = {"/registerUser"})
	public String registerUser(Model model, RegisterDataForm user) {
		
		User newUser = new User(user.getEmail(),user.getName(),user.getPassword());
		
		userSession.setUsername(newUser.getName());
		
		return "/principal";
	}
	
	@RequestMapping(value= {"/loginUser"})
	public String loginUser(Model model, RegisterDataForm user) {
		model.addAttribute("session", userSession);
		
		return "/principal";
	}
	
}
