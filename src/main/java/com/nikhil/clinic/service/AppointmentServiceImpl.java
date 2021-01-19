package com.nikhil.clinic.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nikhil.clinic.model.Appointment;
import com.nikhil.clinic.repository.AppointmentRepository;

@Service
public class AppointmentServiceImpl implements AppointmentService{
	
	@Autowired
	AppointmentRepository repository;

	@Override
	public Appointment saveAppointment(Appointment appointment) {
		return repository.save(appointment);
	}

	@Override
	public List<Appointment> getAppointmentDetails() {
		return repository.findAll();
	}

	@Override
	public String deleteAppointmentByReference(int reference) {
		repository.deleteById(reference);
		return "Deleted SuccessFully";
	}

	@Override
	public Appointment getAppointmentByReference(int reference) {
		Object appointment = repository.findById(reference);
		return (Appointment) appointment;
	}

}
