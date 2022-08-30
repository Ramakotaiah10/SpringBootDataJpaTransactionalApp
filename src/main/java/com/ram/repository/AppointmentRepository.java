package com.ram.repository;

import org.springframework.data.repository.CrudRepository;

import com.ram.entity.Appointment;

public interface AppointmentRepository extends CrudRepository<Appointment, Long> {

}
