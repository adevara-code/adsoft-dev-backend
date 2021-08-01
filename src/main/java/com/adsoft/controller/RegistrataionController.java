/**
 * 
 */
package com.adsoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.adsoft.model.User;
import com.adsoft.service.RegistrataionService;

/**
 * @author admin
 *
 */
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class RegistrataionController {

	@Autowired
	private RegistrataionService service;

	@PostMapping("/register")
	public User registerUser(@RequestBody User user) throws Exception {
		System.out.println("RegistrataionController -> registerUser method calling ");
		String tempEmailId = user.getEmailId();
		if (tempEmailId != null && !"".equals(tempEmailId)) {
			User userObject = service.fetchUserByEmailId(tempEmailId);
			if (userObject != null) {
				throw new Exception("user with " + tempEmailId + " is already exist");
			}
		}
		User userObj = null;
		userObj = service.saveUser(user);
		return userObj;

	}

	@PostMapping("/login")
	public User loginUser(@RequestBody User user) throws Exception {
		System.out.println("RegistrataionController -> loginUser method calling ");
		String tempEmailId = user.getEmailId();
		String tempPass = user.getPassword();
		User userObj = null;
		if (tempEmailId != null && tempPass != null) {
			userObj = service.fetchUserByEmailIdAndPassword(tempEmailId, tempPass);
		}
		if (userObj == null) {
			throw new Exception("Bad Credentials");
		}
		return userObj;
	}

}
