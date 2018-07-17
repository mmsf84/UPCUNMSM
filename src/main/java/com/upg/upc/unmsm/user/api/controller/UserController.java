package com.upg.upc.unmsm.user.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value="upc/user") 
public class UserController {

	
	@PostMapping(
			value= {"/login","/login/"},
			produces="application/json; charset=UTF-8",
			consumes="application/json; charset=UTF-8"
	
			)
	public ResponseEntity<Object> login(){
		
		 return null;
	}
	
}
