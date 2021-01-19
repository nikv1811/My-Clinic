package com.nikhil.clinic.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nikhil.clinic.model.Patient;
import com.nikhil.clinic.repository.PatientRepository;

@Service
public class PatientServiceImpl implements PatientService {

	@Autowired
	PatientRepository repository;
	
	@Override
	public Patient savePatient(Patient patient) {
		return repository.save(patient);
	}

	@Override
	public List<Patient> getPatientDetails() {
		ArrayList<Patient> patients = new ArrayList<Patient>();
		patients = (ArrayList<Patient>) repository.findAll();
		return patients;
	}

	@Override
	public String deletePatientById(int id) {
		repository.deleteById(id);
		return "Deleted SuccessFully";
	}

	@Override
	public Patient getPatientById(int id) {
		Object patient = repository.findById(id);
		return (Patient) patient;
	}

}
