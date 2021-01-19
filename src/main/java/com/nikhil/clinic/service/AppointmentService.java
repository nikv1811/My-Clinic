package com.nikhil.clinic.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nikhil.clinic.model.Appointment;


@Service
public interface AppointmentService {

	Appointment saveAppointment(Appointment appointment);
	List<Appointment> getAppointmentDetails();
	String deleteAppointmentByReference(int reference);
	Appointment getAppointmentByReference(int reference);
}
