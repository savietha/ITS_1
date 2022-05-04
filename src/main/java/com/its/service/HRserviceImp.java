package com.its.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.its.bean.*;
import com.its.dao.InterviewRepo;
import com.its.dao.SharedCandidateRepo;
import com.its.dao.SharedInterviewRepo;

@Service
public class HRserviceImp {
	
	@Autowired
	private InterviewRepo interepo;
	@Autowired
	private SharedCandidateRepo candidate;
	@Autowired
	private SharedInterviewRepo interview;
	
	
	public List<Shared_candidates> viewCandidates(String HRid)
	{
		List<Shared_interviews> si = interview.findAll();
		List<Shared_candidates> sc = candidate.findAll();
		List<Shared_candidates> list = new ArrayList<Shared_candidates>();;
		List <String> candidates = new ArrayList<String>();
		for(Shared_interviews inter : si)
		{
			if(inter.getEmpHRID().contentEquals(HRid))
			{
				candidates.add(inter.getCandidateID());
				System.out.println(inter.getCandidateID());
			}
		}
		for(Shared_candidates candi : sc)
		{
			for(String c : candidates)
			{
				if(candi.getCandidateID().equals(c))
				{
					list.add(candi);
					System.out.println(candi.getCandidateID());
				}
			}	
		}
		return (list);
	}
	
	
	public void submitRating(Rating rate)	
	{
       List<InterviewScheduleBean> inter = interepo.findAll();
	    
	    for (InterviewScheduleBean ib : inter) {
	        if (ib.getInterviewID().equals(rate.getInterviewId()))  
	        {
	            ib.setEmpHRRating(rate.getRatings());
	            interepo.save(ib);
	        }
	    } 
	}
	
	public  List<Shared_interviews> viewFinalResults(String interviewID)
	{
		return (List<Shared_interviews>) interview.findByinterviewID(interviewID);
	}

}
