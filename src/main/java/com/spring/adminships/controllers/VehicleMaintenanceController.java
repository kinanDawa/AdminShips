package com.kindsonthegenius.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleMaintenanceController {
	
	@GetMapping("/vehiclemaintenances")
	public String getvehiclemaintenance() {
		return "VehicleMaintenance";
	}

}
