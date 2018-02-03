package com.school.harvard.dao.mongodb;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


public interface ExamRepository extends MongoRepository<Exam, Integer>{
	 
}
