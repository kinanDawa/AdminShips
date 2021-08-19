package com.kindsonthegenius.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StateController {
	
	@GetMapping("/states")
	public String getStates() {
		return "State";
	}

}
