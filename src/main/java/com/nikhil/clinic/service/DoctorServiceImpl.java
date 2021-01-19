package com.nikhil.clinic.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nikhil.clinic.model.Doctor;
import com.nikhil.clinic.repository.DoctorRepository;

@Service
public class DoctorServiceImpl implements DoctorService {

	@Autowired
	DoctorRepository repository;
	
	
	@Override
	public Doctor saveDoctorDetails(Doctor doctor) {
		return repository.save(doctor);
	}

	@Override
	public List<Doctor> showDoctorDetails() {
		return repository.findAll();
	}

	@Override
	public Doctor findDoctorById(int id) {
		Object doctor = repository.findById(id);
		return (Doctor) doctor;
	}

	@Override
	public String deleteDoctorById(int id) {
		repository.deleteById(id);
		return "Deleted SuccessFully";
	}

	
}
