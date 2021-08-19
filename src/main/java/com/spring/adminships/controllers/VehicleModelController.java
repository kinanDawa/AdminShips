package com.kindsonthegenius.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleModelController {
	
	@GetMapping("/vehiclemodels")
	public String getvehicleModel() {
		return "VehicleModel";
	}

}
