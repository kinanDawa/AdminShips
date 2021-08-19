package com.kindsonthegenius.fleetapp.services;

import java.util.*;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kindsonthegenius.fleetapp.models.Country;
import com.kindsonthegenius.fleetapp.repositories.*;

@Service
public class CountryService {
	
	 @Autowired
	private CountryRepository countryRepository;
	//the service is getting data from Repository
	
	//Get All Countries
	public List<Country> getCountries(){
		return countryRepository.findAll();
	}	

	  //Get Country By Id 
     //optional in case there's no result don't crush :)
	 public Optional<Country> findById(int id) { 
		 return countryRepository.findById(id);
	 }
	   
	  //Delete Country 
	 public void delete(int id) {
	  countryRepository.deleteById(id); 
	  }
	  
	 //Save or add a new Country
	 public void save( Country country) {
	  countryRepository.save(country); 
	  }

}
