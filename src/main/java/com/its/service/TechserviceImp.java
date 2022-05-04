package com.its.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.its.bean.InterviewScheduleBean;
import com.its.bean.Rating;
import com.its.dao.InterviewRepo;

@Service
public class TechserviceImp {
	
	@Autowired
	private InterviewRepo interepo;
	
	public void submitRating(Rating rate)	
	{
		
       List<InterviewScheduleBean> inter = interepo.findAll();
	    
	    for (InterviewScheduleBean ib : inter) {
	        if (ib.getInterviewID().equals(rate.getInterviewId()))  
	        {
	            ib.setTechRating(rate.getRatings());
	            interepo.save(ib);
	        }
	    } 
	}

}
