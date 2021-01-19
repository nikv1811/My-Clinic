package com.nikhil.clinic.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "doctor")
public class Doctor {

	@Id
	@GeneratedValue
	int id;
	String doctorName;
	String specialization;
	long mobileNo;
	String email;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
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
	public Doctor(int id, String doctorName, String specialization, long mobileNo, String email) {
		super();
		this.id = id;
		this.doctorName = doctorName;
		this.specialization = specialization;
		this.mobileNo = mobileNo;
		this.email = email;
	}
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Doctor [id=" + id + ", doctorName=" + doctorName + ", specialization=" + specialization + ", mobileNo="
				+ mobileNo + ", email=" + email + "]";
	}
	
	
	
}
