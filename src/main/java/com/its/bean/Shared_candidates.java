package com.its.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;


@Entity
@Data
public class Shared_candidates {
	
	@Id
	String candidateID;
	String primarySkills;
	String secondarySkills;
	float experience;
	String qualification;
	String designation;
	int noticePeriod;
	String location;
}
