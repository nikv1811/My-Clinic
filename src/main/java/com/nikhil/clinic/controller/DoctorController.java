package com.nikhil.clinic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nikhil.clinic.model.Doctor;
import com.nikhil.clinic.service.DoctorServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class DoctorController {

	@Autowired
	DoctorServiceImpl service;
	
	@PostMapping("/saveDoctorDetails")
	public Doctor saveDoctorDetails(@RequestBody Doctor doctor) {
		return service.saveDoctorDetails(doctor);
	}
	
	@GetMapping("/showDoctorDetails")
	public List<Doctor> showDoctorDetails(){
		return service.showDoctorDetails();
	}
	
	@DeleteMapping("/deleteDoctorDetails/{id}")
	public List<Doctor> deleteDoctorDetails(@PathVariable int id) {
		service.deleteDoctorById(id);
		return service.showDoctorDetails();
	}
}
