package com.its.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.its.bean.Rating;
import com.its.service.TechserviceImp;

@RestController
public class TechController {
	
	@Autowired
	TechserviceImp techservice;
	
	@PutMapping(value = "ITS/submitratings/tech")
	 public ResponseEntity<Object> submitratings(@RequestBody Rating rate)
	 {	
		 techservice.submitRating(rate);
		 return new ResponseEntity<>("Rating submitted successfully", HttpStatus.OK);
	 }

}
