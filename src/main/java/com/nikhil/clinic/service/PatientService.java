package com.nikhil.clinic.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nikhil.clinic.model.Patient;

@Service
public interface PatientService {
	
	Patient savePatient(Patient patient);
	List<Patient> getPatientDetails();
	String deletePatientById(int id);
	Patient getPatientById(int id);
}
