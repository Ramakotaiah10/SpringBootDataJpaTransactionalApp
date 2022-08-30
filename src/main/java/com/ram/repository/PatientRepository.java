package com.ram.repository;

import org.springframework.data.repository.CrudRepository;

import com.ram.entity.Patient;

public interface PatientRepository extends CrudRepository<Patient, Integer> {

}
