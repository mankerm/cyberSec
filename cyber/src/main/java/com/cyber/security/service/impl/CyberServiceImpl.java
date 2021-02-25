package com.cyber.security.service.impl;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.cyber.security.dao.CyberDao;
import com.cyber.security.model.User;
import com.cyber.security.service.CyberService;
import com.cyber.security.utility.PasswordUtils;
import com.cyber.security.utility.ResponseModel;

@Service
public class CyberServiceImpl implements CyberService {

	@Autowired
	private CyberDao cyberDao;
	
	@Override
	public ResponseModel registerUser(User user) {
		String salt = PasswordUtils.getSalt(30);
		String mySecurePassword = PasswordUtils.generateSecurePassword(user.getUserPassword(), salt);
		user.setUserPassword(mySecurePassword);
		cyberDao.registerUser(user);
		
		ResponseModel response = new ResponseModel();
		response.setMessage("User registered successfully");
		response.setStatus(HttpStatus.CREATED.value());
		response.setTimestamp(LocalDateTime.now());
		return response;
		
	}

}
