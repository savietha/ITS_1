package com.its.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.its.bean.CandidateBean;
import com.its.bean.CredentialsBean;
import com.its.bean.InterviewScheduleBean;
import com.its.bean.ProfileBean;
import com.its.exception.CandidateNotFoundException;
import com.its.exception.InterviewNotFoundException;
import com.its.service.AdminserviceImp;



@RestController
public class AdminController {
	
	@Autowired
	AdminserviceImp adminservice;
	
	@GetMapping(path="/ITS/candidatedetails")
	 public List<CandidateBean> getcandidateList()
	 {     
		 if(adminservice.getCandidateDetails().isEmpty())
		 {
			   throw new CandidateNotFoundException();
		 }
		 return adminservice.getCandidateDetails();
	 }
	
	@GetMapping(path="/ITS/profiledetails")
	 public List<ProfileBean> getprofileList()
	 {  
		 if(adminservice.getProfileDetails().isEmpty())
		 {
			   throw new CandidateNotFoundException();
		 }
		 return adminservice.getProfileDetails();
	 }
	
	
	// View candidates
	//get candidates by skills
	@GetMapping(path="/ITS/viewcandidate/byskills/{primarySkills}")
	 public List<CandidateBean> viewcandidate_byskill(@PathVariable("primarySkills") String skills)
	 {  
		 if(adminservice.viewCandidatebyskill(skills).isEmpty())
		 {
			   throw new CandidateNotFoundException();
		 }
		 return adminservice.viewCandidatebyskill(skills);
	 }
	
	//get candidates by experience
	@GetMapping(path="/ITS/viewcandidate/byexperience/{experience}")
	 public List<CandidateBean> viewcandidate_byexperience(@PathVariable("experience") float experience)
	 {  
		 if(adminservice.viewCandidatebyexperience(experience).isEmpty())
		 {
			   throw new CandidateNotFoundException();
		 }
		 return adminservice.viewCandidatebyexperience(experience);
	 }
	
	//get candidates by qualification
	@GetMapping(path="/ITS/viewcandidate/byqualification/{qualification}")
	 public List<CandidateBean> viewcandidate_byqualification(@PathVariable("qualification") String qualification)
	 {  
		 if(adminservice.viewCandidatebyqualification(qualification).isEmpty())
		 {
			   throw new CandidateNotFoundException();
		 }
		 return adminservice.viewCandidatebyqualification(qualification);
	 }
	
	
	    //Insert candidate
		 @PostMapping(value= "ITS/addcandidate/profile")
		  public ResponseEntity<Object> addCandidateProfile(@RequestBody ProfileBean profileBean)
		  { 
		       adminservice.addCandidateProfile(profileBean);
		       return new ResponseEntity<>("Candidate inserted successfully", HttpStatus.OK);

		  }
	
		 @PostMapping(value= "ITS/addcandidate/details")
		  public ResponseEntity<Object> addCandidateDetails( @RequestBody CandidateBean candidateBean)
		  { 
		       adminservice.addCandidateDetails(candidateBean);
		       return new ResponseEntity<>("Candidate inserted successfully", HttpStatus.OK);

		  }
		 
		 //Schedule interview
		 @PostMapping(value = "ITS/scheduleinterview/tech")
		 public ResponseEntity<Object> scheduleInterview(@RequestBody InterviewScheduleBean interviewBean)
		 {
			 
			 adminservice.scheduleInterviewForTech(interviewBean);
			 return new ResponseEntity<>("Interview Scheduleded successfully", HttpStatus.OK);
		 }
		 
		 //scheduling interview for hr
		 @PutMapping(value = "ITS/scheduleinterview/hr")
		 public ResponseEntity<Object> scheduleInterviewForHR(@RequestBody InterviewScheduleBean interviewBean)
		 {
			 adminservice.scheduleInterviewForHR(interviewBean);
			 return new ResponseEntity<>("Interview for HR scheduled successfully", HttpStatus.OK);
		 }
		 
		 //viewRating of candidates by interviewId
		 @GetMapping(value = "ITS/viewrating/{interviewID}")
		 public List<InterviewScheduleBean> viewratingbyinterviewID(@PathVariable("interviewID") String interviewID)
		 {
			 if(adminservice.viewratingbyinterviewID(interviewID).isEmpty())
			 {
				   throw new InterviewNotFoundException();
			}
			 return adminservice.viewratingbyinterviewID(interviewID);
		 }
		 
		 //sharecandidatedetails
		 @PutMapping(value = "ITS/candidate/sharecandidateinfo", consumes= {"application/json"})
		 public ResponseEntity<Object> shareCandidateDetails(@RequestBody CandidateBean candidateBean)
		 {
			 adminservice.shareCandidateDetails(candidateBean);
			 return new ResponseEntity<>("candidate details shared to HR and Tech successfully", HttpStatus.OK);
		 }
		 
		 //finalizeResultDecision
		 @PutMapping(value = "ITS/candidate/ResultDecision")
		 public ResponseEntity<Object> finalizeResultDecision(@RequestBody InterviewScheduleBean interviewBean )
		 {
			 adminservice.finalizeResultDecision(interviewBean);
			 return new ResponseEntity<>("Results finalized successfully", HttpStatus.OK);
		 }
	     //shareResult
		 @PutMapping(value = "ITS/candidate/shareresult", consumes= {"application/json"})
		 public ResponseEntity<Object> shareResult(@RequestBody InterviewScheduleBean interviewBean )
		 {
			 adminservice.shareResult(interviewBean);
			 return new ResponseEntity<>("Results shared successfully", HttpStatus.OK);
		 }
}
