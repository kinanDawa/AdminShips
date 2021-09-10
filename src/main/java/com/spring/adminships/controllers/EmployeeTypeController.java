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
import com.spring.adminships.models.EmployeeType;
import com.spring.adminships.services.EmployeeTypeService;

@Controller
public class EmployeeTypeController {

	  @Autowired private EmployeeTypeService employeeTypeService;

	@GetMapping("/employeeTypes")
	public String getEmployeeTypes(Model model) {
	  List <EmployeeType> employeeTypeList =employeeTypeService.getEmployeeTypes();
	  model.addAttribute("employeeTypes",employeeTypeList);
		return "EmployeeType";
	}
	
	  @PostMapping("/employeeTypes/addNew") 
	  public String addNew(EmployeeType employeeType) {
	  employeeTypeService.save(employeeType); 
	  return "redirect:/employeeTypes"; }

	// after getting this Id we don't want it to return a JSON
	// or redirect to a page that will display a JSON so only return it and capture
	// it
	
	  @RequestMapping("/employeeTypes/findById")
	  @ResponseBody
	  public Optional<EmployeeType> findById(int id) { 
		  return employeeTypeService.findById(id);
	  }
	  
	  @RequestMapping(value= "/employeeTypes/update", method= {RequestMethod.PUT,RequestMethod.GET})
	  public String update(EmployeeType employeeType) {
		  employeeTypeService.save(employeeType); 
		  return "redirect:/employeeTypes"; 
		  }
	  
	  @RequestMapping(value= "/employeeTypes/delete", method= {RequestMethod.DELETE,RequestMethod.GET})
	  public String delete(int id) {
		  employeeTypeService.delete(id); 
		  return "redirect:/employeeTypes"; 
		  }
}
