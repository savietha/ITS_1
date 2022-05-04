package com.its.service;
import java.util.*;

import com.its.bean.*;

public interface Adminservice {
	
	String addCandidateProfile(ProfileBean profileBean);
	
	String addCandidateDetails(CandidateBean candidateBean);
	
	List<CandidateBean> viewCandidatebyskill(String skills);
	
	List<CandidateBean> viewCandidatebyqualification(String qualification);
	
	List<CandidateBean> viewCandidatebyexperience(float experience);
	
	boolean shareCandidateDetails(CandidateBean candidateBean);
	
	String scheduleInterviewForTech(InterviewScheduleBean interviewBean);
	
	boolean scheduleInterviewForHR(InterviewScheduleBean interviewBean);
	
    List<InterviewScheduleBean> viewratingbyinterviewID(String interviewID);
	
	boolean finalizeResultDecision(InterviewScheduleBean interviewBean);
	
	boolean  shareResult(InterviewScheduleBean interviewBean);


}
