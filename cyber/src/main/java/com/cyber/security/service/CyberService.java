package com.cyber.security.service;

import com.cyber.security.model.User;
import com.cyber.security.utility.ResponseModel;

public interface CyberService {

	ResponseModel registerUser(User user);
}
