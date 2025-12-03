package com.mj.bj.auth.service;

import org.springframework.http.ResponseEntity;

import com.mj.bj.auth.dto.LoginDetails;

public interface AuthenticationService {

	public ResponseEntity<?> authenticate(LoginDetails details);
	public ResponseEntity<?> logout(String authHeader);
}
