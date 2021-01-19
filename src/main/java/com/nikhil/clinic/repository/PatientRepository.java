package com.nikhil.clinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nikhil.clinic.model.Patient;

@Repository
public interface PatientRepository extends  JpaRepository<Patient, Integer> {

}