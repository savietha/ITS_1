package com.its.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.its.bean.InterviewScheduleBean;
import com.its.bean.Rating;
import com.its.bean.Shared_candidates;
import com.its.bean.Shared_interviews;
import com.its.exception.CandidateNotFoundException;
import com.its.service.HRserviceImp;

@RestController
public class HRController {
	
	@Autowired
	HRserviceImp hrservice;
	

	@PutMapping(value = "ITS/submitratings/hr")
	 public ResponseEntity<Object> submitratings(@RequestBody Rating rate)
	 {	
		 hrservice.submitRating(rate);
		 return new ResponseEntity<>("Rating submitted successfully", HttpStatus.OK);
	 }
	
	@GetMapping(value = "ITS/viewresult/hr/{interviewID}")
	 public List<Shared_interviews> viewresult(@PathVariable("interviewID") String interviewID)
	 {
		 if(hrservice.viewFinalResults(interviewID).isEmpty())
		 {
			   throw new CandidateNotFoundException();
		}
		 return hrservice.viewFinalResults(interviewID);
	 }
	
	@GetMapping(value = "ITS/viewcandidates/{Hrid}")
	public List<Shared_candidates> viewcandidates(@PathVariable("Hrid") String HrId)
	{
			if(hrservice.viewCandidates(HrId).isEmpty())
			{
				throw new CandidateNotFoundException();
			}
			return hrservice.viewCandidates(HrId);
	}
	

}




