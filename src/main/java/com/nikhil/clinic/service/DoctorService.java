package com.nikhil.clinic.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nikhil.clinic.model.Doctor;

@Service
public interface DoctorService {

	Doctor saveDoctorDetails(Doctor doctor);
	List<Doctor> showDoctorDetails();
	Doctor findDoctorById(int id);
	String deleteDoctorById(int id);
}
