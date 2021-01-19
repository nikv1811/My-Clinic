package com.nikhil.clinic.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "appointment")
public class Appointment {
	
	@Id
	@GeneratedValue
	int referenceNo;
	int patientId;
	int doctorId;
	LocalDate bookingDate;
	LocalDate requestDate;
	String description;
	String status;
	public int getReferenceNo() {
		return referenceNo;
	}
	public void setReferenceNo(int referenceNo) {
		this.referenceNo = referenceNo;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public LocalDate getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}
	public LocalDate getRequestDate() {
		return requestDate;
	}
	public void setRequestDate(LocalDate requestDate) {
		this.requestDate = requestDate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Appointment(int referenceNo, int patientId, int doctorId, LocalDate bookingDate, LocalDate requestDate,
			String description, String status) {
		super();
		this.referenceNo = referenceNo;
		this.patientId = patientId;
		this.doctorId = doctorId;
		this.bookingDate = bookingDate;
		this.requestDate = requestDate;
		this.description = description;
		this.status = status;
	}
	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Appointment [referenceNo=" + referenceNo + ", patientId=" + patientId + ", doctorId=" + doctorId
				+ ", bookingDate=" + bookingDate + ", requestDate=" + requestDate + ", description=" + description
				+ ", status=" + status + "]";
	}
	
	
	
}
