/**
 * 
 */
package com.adsoft.controller;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adsoft.model.Country;
import com.adsoft.repository.CountryRepository;

/**
 * @author admin
 *
 *         http://localhost:9097/api/v1/
 */
@RestController
@Validated
@RequestMapping("/api/v1")
public class CountryController {

	private final static Logger log = LoggerFactory.getLogger(CountryController.class);

	@Autowired
	private CountryRepository dao;

	@GetMapping("/getAllCountry")
	public Iterable<Country> getAllCountry() {
		System.out.println("CountryController -> inside getAllCountry method");
		return dao.findAll();
	}

	@GetMapping("/getCountryById/{countryId}")
	public Optional<Country> getCountryById(@PathVariable("countryId") int countryId) {
		System.out.println("CountryController -> inside getCountryById method");
		return dao.findById(countryId);
	}
	
	@PostMapping("/addCountry")
	public Country addCountry(@RequestBody Country country) {
		log.info("CountryController -> inside addCountry method");
		log.info("the saving country name is: " + country);
		return dao.save(country);
	}

	@PutMapping("/updateCountry")
	public Country updateCountry(@RequestBody Country country) {
		System.out.println("CountryController -> inside getCountryById method");
		return dao.save(country);
	}

	@DeleteMapping("/delete/{countryId}")
	public void deleteCountry(@PathVariable("countryId") int countryId) {
		System.out.println("CountryController -> inside deleteCountry method");
		dao.deleteById(countryId);
	}

}
