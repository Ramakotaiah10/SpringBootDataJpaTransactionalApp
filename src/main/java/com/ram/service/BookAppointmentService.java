package com.ram.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ram.entity.Appointment;
import com.ram.entity.Patient;
import com.ram.repository.AppointmentRepository;
import com.ram.repository.PatientRepository;

@Service
@Transactional
public class BookAppointmentService {

	@Autowired
	private PatientRepository patientRepo;

	@Autowired
	private AppointmentRepository appointmentRepo;

	public String bookAppointment(Patient patient) {
		
        int patientNo = patientRepo.save(patient).getId();
		System.out.println(">>>>>>>>>>>>>>>>Sucessfull saved>>>>>>>>>>>>>>>>>");

		System.out.println(10/0);
		
		Appointment appointment = Appointment.builder()
				.date(LocalDate.of(2022, 7, 30))
				.doctorNo("DOC102")
				.patientNo(patientNo).build();

		Long appointmentNo = appointmentRepo.save(appointment).getAppointmentNo();

		return " Appointment booked successfully!! with " + appointmentNo;
	}
}
