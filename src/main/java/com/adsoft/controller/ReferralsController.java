/**
 * 
 */
package com.adsoft.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.adsoft.exception.ResourceNotFoundException;
import com.adsoft.model.Employee;
import com.adsoft.model.Referrals;
import com.adsoft.repository.ReferralsRepository;

/**
 * @author ashok
 *
 */
@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "http://localhost:4200")
public class ReferralsController {

	private final static Logger log = LoggerFactory.getLogger(ReferralsController.class);
	@Autowired
	private ReferralsRepository referralsRepository;

	// get referrals rest api
	@GetMapping("/referrals")
	public List<Referrals> getAllReferrals() {
		log.info("ReferralsController -> inside getAllReferrals method");
		return referralsRepository.findAll();

	}

	// create referrals rest api
	@RequestMapping(value = "/referrals", method = RequestMethod.POST)
	public Referrals createReferrals(@RequestBody Referrals employee) {
		log.info("ReferralsController -> inside createReferrals method");
		return referralsRepository.save(employee);
	}

	// get Referrals by id rest api
	@GetMapping("/referrals/{id}")
	public ResponseEntity<Referrals> getReferralsById(@PathVariable Long id) {
		log.info("ReferralsController -> inside getReferralsById method");
		Referrals referrals = referralsRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Referrals not exist with id :" + id));
		return ResponseEntity.ok(referrals);
	}

	// update referrals rest api
	@PutMapping("/referrals/{id}")
	public ResponseEntity<Referrals> updateReferrals(@PathVariable Long id, @RequestBody Referrals referralsDetails) {
		log.info("ReferralsController -> inside updateReferrals method");
		Referrals referrals = referralsRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Referrals not exist with id :" + id));

		referrals.setReferralsFullName(referralsDetails.getReferralsFullName());
		referrals.setReferralsEmail(referralsDetails.getReferralsEmail());
		referrals.setReferralsContactNo(referralsDetails.getReferralsContactNo());
		referrals.setReferralsSkills(referralsDetails.getReferralsSkills());
		referrals.setRelevantYearsOfEperience(referralsDetails.getRelevantYearsOfEperience());
		referrals.setLocation(referralsDetails.getLocation());
		referrals.setNoticePeriod(referralsDetails.getNoticePeriod());

		Referrals updatedReferrals = referralsRepository.save(referrals);
		return ResponseEntity.ok(updatedReferrals);
	}

	// delete referrals rest api
	@DeleteMapping("/referrals/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteReferrals(@PathVariable Long id) {
		log.info("ReferralsController -> inside deleteReferrals method");
		Referrals referrals = referralsRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Referrals not exist with id :" + id));
		referralsRepository.delete(referrals);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
}
