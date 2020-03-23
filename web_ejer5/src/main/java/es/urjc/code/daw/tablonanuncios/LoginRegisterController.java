package es.urjc.code.daw.tablonanuncios;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import es.urjc.code.daw.tablonanuncios.UserSession;
import es.urjc.code.daw.tablonanuncios.RegisterDataForm;
import es.urjc.code.daw.tablonanuncios.User;

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
