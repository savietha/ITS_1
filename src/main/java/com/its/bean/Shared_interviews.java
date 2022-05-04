package com.its.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Shared_interviews {
	
	@Id
	   String interviewID;
	   String candidateID;
	   String subject;
	   String techID;
	   String interviewDate;
	   String interviewTime;
	   float techRating;
	   String empHRID;
	   String empHRInterviewDate;
	   String empHRInterviewTime;
	   float empHRRating;
	   String result;

}
