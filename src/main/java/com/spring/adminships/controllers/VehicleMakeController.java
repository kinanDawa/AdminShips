package com.spring.adminships.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.spring.adminships.models.VehicleMake;
import com.spring.adminships.services.VehicleMakeService;


@Controller
public class VehicleMakeController {
	

	  @Autowired private VehicleMakeService vehicleMakeService;

	@GetMapping("/vehicleMakes")
	public String getVehicleMakes(Model model) {
	  List <VehicleMake> vehicleMakeList =vehicleMakeService.getVehicleMakes();
	  model.addAttribute("vehicleMakes",vehicleMakeList);  
		return "VehicleMake";
	}
	
	  @PostMapping("/vehicleMakes/addNew") 
	  public String addNew(VehicleMake vehicleMake) {
	  vehicleMakeService.save(vehicleMake); 
	  return "redirect:/vehicleMakes"; }

	// after getting this Id we don't want it to return a JSON
	// or redirect to a page that will display a JSON so only return it and capture
	// it
	
	  @RequestMapping("/vehicleMakes/findById")
	  @ResponseBody
	  public Optional<VehicleMake> findById(int id) { 
		  return vehicleMakeService.findById(id);
	  }
	  
	  @RequestMapping(value= "/vehicleMakes/update", method= {RequestMethod.PUT,RequestMethod.GET})
	  public String update(VehicleMake vehicleMake) {
		  vehicleMakeService.save(vehicleMake); 
		  return "redirect:/vehicleMakes"; 
		  }
	  
	  @RequestMapping(value= "/vehicleMakes/delete", method= {RequestMethod.DELETE,RequestMethod.GET})
	  public String delete(int id) {
		  vehicleMakeService.delete(id); 
		  return "redirect:/vehicleMakes"; 
		  }

}
