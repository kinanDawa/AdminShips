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
import com.spring.adminships.models.InvoiceStatus;
import com.spring.adminships.services.InvoiceStatusService;

@Controller
public class InvoiceStatusController {
	

	  @Autowired private InvoiceStatusService invoiceStatusService;

	@GetMapping("/invoiceStatuses")
	public String getInvoiceStatuss(Model model) {
	  List <InvoiceStatus> invoiceStatusList =invoiceStatusService.getInvoiceStatuses();
	  model.addAttribute("invoiceStatuss",invoiceStatusList);  
		return "InvoiceStatus";
	}
	
	  @PostMapping("/invoiceStatuss/addNew") 
	  public String addNew(InvoiceStatus invoiceStatus) {
	  invoiceStatusService.save(invoiceStatus); 
	  return "redirect:/invoiceStatuss"; }

	// after getting this Id we don't want it to return a JSON
	// or redirect to a page that will display a JSON so only return it and capture
	// it
	
	  @RequestMapping("/invoiceStatuss/findById")
	  @ResponseBody
	  public Optional<InvoiceStatus> findById(int id) { 
		  return invoiceStatusService.findById(id);
	  }
	  
	  @RequestMapping(value= "/invoiceStatuss/update", method= {RequestMethod.PUT,RequestMethod.GET})
	  public String update(InvoiceStatus invoiceStatus) {
		  invoiceStatusService.save(invoiceStatus); 
		  return "redirect:/invoiceStatuses"; 
		  }
	  
	  @RequestMapping(value= "/invoiceStatuss/delete", method= {RequestMethod.DELETE,RequestMethod.GET})
	  public String delete(int id) {
		  invoiceStatusService.delete(id); 
		  return "redirect:/invoiceStatuses"; 
		  }

}
