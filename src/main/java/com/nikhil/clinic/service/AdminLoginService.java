package com.nikhil.clinic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nikhil.clinic.model.Admin;
import com.nikhil.clinic.repository.AdminRepository;

@Service
public class AdminLoginService {

	@Autowired
	AdminRepository repository;
	
	public List<Admin> getAdminCredentials() {
		return repository.findAll();
	}
}
