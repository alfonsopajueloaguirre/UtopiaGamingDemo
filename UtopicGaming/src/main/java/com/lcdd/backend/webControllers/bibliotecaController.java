package com.lcdd.backend.webControllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class bibliotecaController {
	
	@GetMapping(value= {"biblioteca"})
	public String serveBiblio(Model model) {
		return "biblioteca";
	}
}

