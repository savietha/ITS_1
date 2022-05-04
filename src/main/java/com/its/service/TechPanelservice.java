package com.its.service;

import java.util.*;

import com.its.bean.*;

public interface TechPanelservice 
{

	List<CandidateBean> viewCandidates(String techID, Date interviewDate);
	
	boolean submitRatings(String interviewID, String techID, float rating);
	
	InterviewScheduleBean viewFinalResults(String interviewID);

}
