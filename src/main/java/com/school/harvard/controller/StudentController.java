package com.school.harvard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.harvard.dao.jpa.sqlRepository;
import com.school.harvard.dao.mongodb.ExamRepository;


@CrossOrigin
@RestController
public class StudentController {
	
	@Autowired
	sqlRepository examRepo;
	
	@Autowired
	ExamRepository examMongoRepo;
	
	

	
	@RequestMapping("/hello")
    String gethelloWorld() {
   	examRepo.count();
		long	count =examMongoRepo.count();
		return "Hello World!" + count ;
    }
}
