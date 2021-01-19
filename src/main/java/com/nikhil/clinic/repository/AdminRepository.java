package com.nikhil.clinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nikhil.clinic.model.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {
	
}
