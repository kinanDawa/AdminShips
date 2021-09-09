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

import com.spring.adminships.models.Country;
import com.spring.adminships.models.Location;
import com.spring.adminships.models.State;
import com.spring.adminships.services.CountryService;
import com.spring.adminships.services.LocationService;
import com.spring.adminships.services.StateService;

@Controller
public class VehicleMakeController {
	

	  @Autowired private LocationService vehicleMakeService;
	  @Autowired private CountryService countryService;
	  @Autowired private StateService stateService;

	@GetMapping("/vehicleMakes")
	public String getLocations(Model model) {
	  List <Location> vehicleMakeList =vehicleMakeService.getLocations();
	  model.addAttribute("vehicleMakes",vehicleMakeList);
	  
	  List <Country> countryList =countryService.getCountries();
	  model.addAttribute("countries",countryList);
	  
	  List <State> stateList =stateService.getStates();
	  model.addAttribute("states",stateList);
	  
		return "Location";
	}
	
	  @PostMapping("/vehicleMakes/addNew") 
	  public String addNew(Location vehicleMake) {
	  vehicleMakeService.save(vehicleMake); 
	  return "redirect:/vehicleMakes"; }

	// after getting this Id we don't want it to return a JSON
	// or redirect to a page that will display a JSON so only return it and capture
	// it
	
	  @RequestMapping("/vehicleMakes/findById")
	  @ResponseBody
	  public Optional<Location> findById(int id) { 
		  return vehicleMakeService.findById(id);
	  }
	  
	  @RequestMapping(value= "/vehicleMakes/update", method= {RequestMethod.PUT,RequestMethod.GET})
	  public String update(Location vehicleMake) {
		  vehicleMakeService.save(vehicleMake); 
		  return "redirect:/vehicleMakes"; 
		  }
	  
	  @RequestMapping(value= "/vehicleMakes/delete", method= {RequestMethod.DELETE,RequestMethod.GET})
	  public String delete(int id) {
		  vehicleMakeService.delete(id); 
		  return "redirect:/vehicleMake"; 
		  }

}
