package com.rockgustavo.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.rockgustavo.main.model.User;

@RestController
public class HomeController {
	ModelAndView mv = new ModelAndView();
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	@GetMapping("/")
	public ModelAndView index2() {
		mv.setViewName("home/index");
		return mv;
	}
	
	@GetMapping("/logar")
	public ModelAndView index() {
		mv.setViewName("home/index");
		return mv;
	}
	
	@PostMapping("/logar")
	public ModelAndView create(User user) {
		System.out.println("LOGIN: " + user.getName() + " - SENHA: " + passwordEncoder.encode(user.getPassword()));
		
		mv.setViewName("home/index");
		return mv;
	}

}