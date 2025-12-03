package com.mj.bj.auth.service.impl;

import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.bj.security.service.AuthService;
import com.bj.security.serviceImpl.CacheUtilService;
import com.bj.security.serviceImpl.JWTServiceImpl;
import com.mj.bj.auth.dto.LoginDetails;
import com.mj.bj.auth.service.AuthenticationService;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
	
	@Autowired 
	private CacheUtilService cacheService;
	
	@Autowired 
	private AuthService authService;
	
	@Autowired
    private JWTServiceImpl jwtUtil;
	

	public ResponseEntity<?> authenticate(LoginDetails details) {
	    try {
//	        if (authHeader == null || !authHeader.startsWith("Basic ")) {
//	            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
//	                                 .body("Missing or invalid Authorization header");
//	        }
//	        String base64Credentials = authHeader.substring("Basic ".length()).trim();
//	        String credentials = new String(Base64.getDecoder().decode(base64Credentials));
//	        String[] values = credentials.split(":", 2);
//
//	        if (values.length != 2) {
//	            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
//	                                 .body("Invalid basic auth format");
//	        }

//	        String username = values[0];
//	        String password = values[1];
	    	
	    	String username = details.username;
	    	String password = details.password;

	        String token = authService.authenticateUser(username, password);
	        return ResponseEntity.ok(token);

	    } catch (Exception e) {
	        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(e.getMessage());
	    }
	}


	
	public ResponseEntity<?> logout(String authHeader) {

		try {
			if (authHeader == null || !authHeader.startsWith("Bearer ")) {
				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("false");
			}

			String jwt = authHeader.substring(7);
			String userId = jwtUtil.extractUsername(jwt).split("~")[0];
			cacheService.delete(userId);
			return ResponseEntity.status(HttpStatus.ACCEPTED).body("true");
			
		}catch(Exception ex) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("false");
		}
		
	}
		
}
