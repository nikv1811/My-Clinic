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
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nikhil.clinic.model.Patient;
import com.nikhil.clinic.service.PatientServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class PatientController {

	@Autowired
	PatientServiceImpl service;
	
	@PostMapping("/savePatient")
	public Patient savePatient(@RequestBody Patient patient) {
		return service.savePatient(patient);
	}
	
	@GetMapping("/showPatients")
	public List<Patient> getPatientDetails(){
		return service.getPatientDetails();
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@DeleteMapping("/deletePatient/{id}")
	public List<Patient> deletePatientById(@PathVariable int id) {
		service.deletePatientById(id);
		return service.getPatientDetails();
	}
}
