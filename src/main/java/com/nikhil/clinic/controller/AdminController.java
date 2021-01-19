package com.nikhil.clinic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nikhil.clinic.model.Admin;
import com.nikhil.clinic.service.AdminLoginService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class AdminController {

	@Autowired
	AdminLoginService loginService;
	
	@GetMapping("/getAdminCredentials")
	public List<Admin> getAdminCredentials() {
		return loginService.getAdminCredentials();
	}
	
}
