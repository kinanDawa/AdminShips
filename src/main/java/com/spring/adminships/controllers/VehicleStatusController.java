package com.kindsonthegenius.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleStatusController {
	
	@GetMapping("/vehiclestatuses")
	public String getvehicleStatus() {
		return "VehicleStatus";
	}

}
