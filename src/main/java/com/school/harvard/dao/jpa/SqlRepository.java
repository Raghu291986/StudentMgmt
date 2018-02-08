package com.school.harvard.dao.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
/**
 * if gneric argument is not given then spring contsiner will not start
 * @author ezraksi
 *
 */
public interface SqlRepository extends JpaRepository<Exam,Integer> {
	 
	 /**
	    * This method will find an Boooking instance in the database by its departure.
	    * Note that this method is not implemented and its working code will be
	    * automatically generated from its signature by Spring Data JPA.
	    */
	  // public Exam findByDeparture(String departure);

}

