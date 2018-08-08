/*package com.roombooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.roombooking.entity.Login;
import com.roombooking.services.LoginService;

@RestController
@RequestMapping("/app")
public class LoginController {

	@Autowired
	private LoginService loginService;
	
	@GetMapping("/login")
	public Login getLoginDetails(@RequestParam(value = "id")Long id){
		return loginService.getLogin(id);
	}

	@PostMapping("/login")
	public Login saveLoginDetails(@RequestBody Login login){
		return loginService.saveLogin(login);
	}
	
	@PutMapping("/login")
	public Login updateLoginDetails(@RequestBody Login login){
		return loginService.saveLogin(login);
	}
}
*/