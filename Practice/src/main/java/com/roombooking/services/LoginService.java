/*package com.roombooking.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.roombooking.entity.Login;
import com.roombooking.repository.LoginRepository;

public class LoginService {
	
	@Autowired
	private LoginRepository loginRepository;
	
	public Login getLogin(Long id){
		return loginRepository.findOne(id);
	}
	
	public Login saveLogin(Login login){
		return loginRepository.save(login);
	}
}
*/