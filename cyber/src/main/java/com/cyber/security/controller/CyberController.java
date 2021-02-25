package com.cyber.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cyber.security.model.User;
import com.cyber.security.service.CyberService;
import com.cyber.security.utility.ResponseModel;

@RestController
@RequestMapping("/cyber")
public class CyberController {
	
	@Autowired
	private CyberService cyberService;

	@PostMapping(value = "/registeruser", consumes = "application/JSON")
	public ResponseEntity<ResponseModel> registerBorrower(@RequestBody User user) {
		ResponseModel response = cyberService.registerUser(user);
		return new ResponseEntity<>(response, HttpStatus.CREATED);
	}
}
