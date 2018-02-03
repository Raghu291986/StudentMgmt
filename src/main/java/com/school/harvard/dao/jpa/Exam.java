package com.school.harvard.dao.jpa;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

	/**
	 * @author rakesh
	 *
	 */
	@Entity
	@Table(name = "Exam")
	public class Exam implements Serializable{

	 /**
	  * 
	  */
	 private static final long serialVersionUID = 1L;
	 
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 int examId;
	
	 @Column
	 String examName;
	 @Column
	 String examType;
	 @Column
	 String examMonth;
	public int getExamId() {
		return examId;
	}
	public void setExamId(int i) {
		this.examId = i;
	}
	public String getExamName() {
		return examName;
	}
	public void setExamName(String examName) {
		this.examName = examName;
	}
	public String getExamType() {
		return examType;
	}
	public void setExamType(String examType) {
		this.examType = examType;
	}
	public String getExamMonth() {
		return examMonth;
	}
	public void setExamMonth(String examMonth) {
		this.examMonth = examMonth;
	}
	
	 
	 


}
