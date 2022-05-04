package com.its.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.its.bean.CandidateBean;
import com.its.bean.CredentialsBean;
import com.its.bean.InterviewScheduleBean;
import com.its.bean.ProfileBean;
import com.its.bean.RegisterBean;
import com.its.bean.Shared_candidates;
import com.its.bean.Shared_interviews;
import com.its.dao.CandidateRepo;
import com.its.dao.CredentialRepo;
import com.its.dao.InterviewRepo;
import com.its.dao.ProfileBeanRepo;
import com.its.dao.RegisterRepo;
import com.its.dao.SharedCandidateRepo;
import com.its.dao.SharedInterviewRepo;


@Service
public class AdminserviceImp implements Adminservice {
	
	
	@Autowired
	private CandidateRepo candirepo;
	@Autowired
	private ProfileBeanRepo prorepo;
	@Autowired
	private InterviewRepo interepo;
	@Autowired
	private RegisterRepo logrepo;
	@Autowired
	private CredentialRepo credrepo;
	@Autowired
	private SharedCandidateRepo sharerepo;
	@Autowired
	private SharedInterviewRepo sirepo;
	
	
	public String addCandidateProfile(ProfileBean profileBean)
	{
		prorepo.save(profileBean);
		return "Inserted Successfully";
	}
	
	public String addCandidateDetails(CandidateBean candidateBean)
	{
		candirepo.save(candidateBean);
		return "Inserted Successfully";
	}
	
	
	//list by skills
	public List<CandidateBean> viewCandidatebyskill(String skills)
	{
		return (List<CandidateBean>) candirepo.findByPrimarySkills(skills);
	}
	//list by experience
	public List<CandidateBean> viewCandidatebyexperience(float experience)
	{
		return (List<CandidateBean>) candirepo.findByExperience(experience);
	}
	//list by qualification
	public List<CandidateBean> viewCandidatebyqualification(String qualification)
	{
		return (List<CandidateBean>) candirepo.findByQualification(qualification);
	}
	
	//Schedule interview
	public String scheduleInterviewForTech(InterviewScheduleBean interviewBean)
	{	
		interepo.save(interviewBean);
		return "Interview scheduled successfully!!";
	}
	
	//Schedule interview for hr
	public boolean scheduleInterviewForHR(InterviewScheduleBean interviewBean)
	{	
		interepo.save(interviewBean);
		return false;
	}
	//viewRating
	public List<InterviewScheduleBean> viewratingbyinterviewID(String interviewID)
	{
		return (List<InterviewScheduleBean>) interepo.findByinterviewID(interviewID);
	}
		
	//shareCandidateDetails
	public boolean shareCandidateDetails(CandidateBean candidateBean)
	{	
		Shared_candidates candi = (Shared_candidates) objectMapper(candidateBean);
		sharerepo.save(candi);
		return true;
	} 
	
	//finalizeresultDecision
	public boolean finalizeResultDecision(InterviewScheduleBean interviewBean)
	{	
		if(interviewBean.getEmpHRRating() >=3 && interviewBean.getTechRating() >=3)
		{
			interviewBean.setResult("Cleared");
		}
		else
		{
		interviewBean.setResult("Sorry! Not Cleared");
		
		}
		interepo.save(interviewBean);
		
		return true;
	} 
	
	//shareresult
	public boolean shareResult(InterviewScheduleBean interviewBean)
	{	
		//interepo.save(interviewBean);
		Shared_interviews inter = (Shared_interviews) objectMapper1(interviewBean);
		sirepo.save(inter);
		return true;
	} 

	//List All Candidate details
    public List<CandidateBean> getCandidateDetails() 
    {
	   return (List<CandidateBean>) candirepo.findAll();
    }
    //List all profile
    public List<ProfileBean> getProfileDetails()
    {
    	return (List<ProfileBean>) prorepo.findAll();
    }

	
    

	 public static Object objectMapper(Object object){
	    	ObjectMapper mapper = new ObjectMapper();
	    	mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
	    	 Shared_candidates cand = mapper.convertValue(object, Shared_candidates.class);
	        return cand;
	    }
	 
	 public static Object objectMapper1(Object object){
	    	ObjectMapper mapper = new ObjectMapper();
	    	mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
	    	Shared_interviews inter = mapper.convertValue(object, Shared_interviews.class);
	        return inter;
	    }

   

}
