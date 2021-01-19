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

import com.nikhil.clinic.model.Appointment;
import com.nikhil.clinic.service.AppointmentServiceImpl;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api")
public class AppointmentController {

	@Autowired
	AppointmentServiceImpl service;
	
	@PostMapping("/saveAppointment")
	public Appointment generateAppointMent(@RequestBody Appointment appointment) {
		return service.saveAppointment(appointment);
	}
	

	
	@GetMapping("/showAppointments")
	public List<Appointment> showAppointments(){
		return service.getAppointmentDetails();
	}
	
	@DeleteMapping("/deleteAppointment/{reference}")
	public String deleteAppointment(@PathVariable int reference) {
		service.deleteAppointmentByReference(reference);
		return"Deleted SuccessFully";
	}
	
}
