package com.its.bean;

import javax.persistence.*;
import lombok.Data;

@Table(name = "ITS_Candidate")
@Entity
@Data
public class CandidateBean {
	
	@Id
	String candidateID;
	String primarySkills;
	String secondarySkills;
	float experience;
	String qualification;
	String designation;
	int noticePeriod;
	String location;
	int shareDetails;
}
