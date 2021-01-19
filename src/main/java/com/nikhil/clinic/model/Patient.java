package com.nikhil.clinic.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "patient")
public class Patient {

	@Id
	@GeneratedValue
	int patientId;
	String patientName;
	String gender;
	LocalDate dateOfBirth;
	long mobileNo;
	String email;
	String password;
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Patient(int patientId, String patientName, String gender, LocalDate dateOfBirth, long mobileNo, String email,
			String password) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.mobileNo = mobileNo;
		this.email = email;
		this.password = password;
	}
	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", gender=" + gender
				+ ", dateOfBirth=" + dateOfBirth + ", mobileNo=" + mobileNo + ", email=" + email + ", password="
				+ password + "]";
	}
	
	
	
}
