package com.school.harvard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.school.harvard.dao.jpa.Exam;
import com.school.harvard.dao.jpa.ExamService;
//import com.school.harvard.dao.jpa.sqlRepository;
import com.school.harvard.dao.mongodb.ExamRepository;


@CrossOrigin
@RestController
public class StudentController {
	
	@Autowired
	ExamService examRepo;
	
	/*@Autowired
	ExamRepository examMongoRepo;*/
//	
//    @RequestMapping(method = RequestMethod.GET)
//
//    String get() {
//
//        return "Hello from get";
//
//    }

//    @RequestMapping(method = RequestMethod.DELETE)
//
//    String delete() {
//
//        return "Hello from delete";
//
//    }

    @RequestMapping(value="/exam",method = RequestMethod.POST)

    String post(@RequestBody  Exam exam) {

    	examRepo.addExam(exam);
    	return "Hello from post";

    }

	
	
//    String gethelloWorld() {
//		long	count=examRepo.count();
//	//	long	count =examMongoRepo.count();
//		return "Hello World!" + count ;
//    }
}
