package com.its.service;

import java.util.*;

import com.its.bean.*;

public interface HRPanelservice 
{
    List<Shared_candidates> viewCandidates();
	
	boolean submitRating(Rating rate);
	
	List<InterviewScheduleBean> viewFinalResults(String interviewID);

}
