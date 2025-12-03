package com.mj.bj.auth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mj.bj.auth.dto.LoginDetails;
import com.mj.bj.auth.service.impl.AuthenticationServiceImpl;

@RestController
@RequestMapping("/auth")
public class LoginController {
	
	@Autowired
	private AuthenticationServiceImpl service;
	
    @PostMapping("/generateToken")
    public ResponseEntity<?> login(@RequestBody LoginDetails details)  {
       try {
//    	   Object sessionObject =null;
		return service.authenticate(details);
	} catch (Exception e) {
		e.printStackTrace();
		return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
	}
    }
    
//    @PostMapping("/verifyToken")
//    public ResponseEntity<?> verify(@RequestHeader("Authorization") String authHeader)  {
//       try {
//		return service.validateToken(authHeader);
//	} catch (Exception e) {
//		e.printStackTrace();
//		return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("false");
//	}
//    }
    
    @PostMapping("/logout")
    public ResponseEntity<?> logout(@RequestHeader("Authorization") String authHeader)  {
       try {
		return service.logout(authHeader);
	} catch (Exception e) {
		e.printStackTrace();
		return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("false");
	}
    }
    
//    @PostMapping("/save")
//    public ResponseEntity<?> save(@RequestBody Object sessionObject )  {
//       try {
//		return service.saveInCache(sessionObject);
//	} catch (Exception e) {
//		e.printStackTrace();
//		return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("false");
//	}
//    }
}
