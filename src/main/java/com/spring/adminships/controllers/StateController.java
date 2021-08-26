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

import com.spring.adminships.models.*;
import com.spring.adminships.services.CountryService;
import com.spring.adminships.services.StateService;

@Controller
public class StateController {

	
	  @Autowired private StateService stateService;
	  @Autowired private CountryService countryService;

	@GetMapping("/states")
	public String getStates(Model model) {
	  List <State> stateList =stateService.getStates();
	  model.addAttribute("states",stateList);
	  
	  List <Country> countryList =countryService.getCountries();
	  model.addAttribute("countries",countryList);
	  
		return "State";
	}
	
	  @PostMapping("/states/addNew") 
	  public String addNew(State state) {
	  stateService.save(state); 
	  return "redirect:/states"; }

	// after getting this Id we don't want it to return a JSON
	// or redirect to a page that will display a JSON so only return it and capture
	// it
	
	  @RequestMapping("/states/findById")
	  @ResponseBody
	  public Optional<State> findById(int id) { 
		  return stateService.findById(id);
	  }
	  
	  @RequestMapping(value= "/states/update", method= {RequestMethod.PUT,RequestMethod.GET})
	  public String update(State state) {
		  stateService.save(state); 
		  return "redirect:/states"; 
		  }
	  
	  @RequestMapping(value= "/states/delete", method= {RequestMethod.DELETE,RequestMethod.GET})
	  public String delete(int id) {
		  stateService.delete(id); 
		  return "redirect:/states"; 
		  }
}
