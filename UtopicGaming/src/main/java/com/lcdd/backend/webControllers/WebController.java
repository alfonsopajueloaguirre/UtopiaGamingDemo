package com.lcdd.backend.webControllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

// import es.urjc.code.security.User;

@Controller
public class WebController {

  @RequestMapping("/admin")
  public String admin(Model model, HttpServletRequest request) {
	  // User user = userRepository.findByName(request.getUserPrincipal().getName());	
	  model.addAttribute("admin", request.isUserInRole("ADMIN"));
	  // model.addAttribute("username", user.getName());
	  return "admin";
  }
  @RequestMapping("/register")
  public String register() {
    return "register";
  }
  @RequestMapping(value= {"home","index","/"})
  public String index() {
    return "index";
  }

}