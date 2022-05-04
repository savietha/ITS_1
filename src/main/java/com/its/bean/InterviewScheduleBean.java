package com.its.bean;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Table(name = "Interview")
@Entity
@Data
public class InterviewScheduleBean 
{
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
   int shareResult;

}

