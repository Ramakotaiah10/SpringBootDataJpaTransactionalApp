package com.ram.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ram.entity.Patient;
import com.ram.service.BookAppointmentService;

@RestController
public class BookAppointmentController {

	@Autowired
	private BookAppointmentService service;
	
	@PostMapping("/book")
    public String bookAppointment(@RequestBody Patient patient)
    {
      return service.bookAppointment(patient); 
         
    }
	
}
