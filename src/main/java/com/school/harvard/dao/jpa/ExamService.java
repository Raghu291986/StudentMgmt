package com.school.harvard.dao.jpa;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service	
public class ExamService {

	@Autowired
	private SqlRepository sqlRepository;
	
	// Retrieve all rows from table and populate list with objects
	public List getAllReservations() {
		
		List exam = new ArrayList<>();
		sqlRepository.findAll().forEach(exam::add);
		
		return exam;
	}
	
	// Retrieves one row from table based on given id
//	public Exam getReservation(Integer id) {
//		return sqlRepository.findOne(id);
//	
//	}
//	
	// Inserts row into table 
	public void addExam(Exam reservation) {
		sqlRepository.save(reservation);
	}
	
	// Updates row in table
//	public void updateReservation(Long id, Exam reservation) {
//		sqlRepository.save(reservation);
//	}
//	
//	// Removes row from table
//	public void deleteReservation(Integer id) {
//		sqlRepository.delete(id);
//	}
}