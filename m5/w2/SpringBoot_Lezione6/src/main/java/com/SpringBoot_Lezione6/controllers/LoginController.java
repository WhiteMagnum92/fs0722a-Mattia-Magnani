package com.SpringBoot_Lezione6.controllers;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import com.SpringBoot_Lezione6.models.User;

@Controller
public class LoginController {
	
	@GetMapping("/login")
    public ModelAndView showFormLogin() {
        ModelAndView model = new ModelAndView("login");
        return model;
    }
	
	@PostMapping("/userlog")
	@ResponseStatus()
    public ModelAndView testLogin( User user ) {
        ModelAndView model = new ModelAndView("home");
        model.addObject("name", user.getName());
        model.addObject("email", user.getEmail());
        return model;
    }
	
	@GetMapping("/test")
    public ResponseEntity<String> test() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Author", "Mattia Magnani");    
        return new ResponseEntity<String>("Pagina di test", headers, HttpStatus.OK);
    }
}
