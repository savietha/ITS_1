package com.its.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class ITSExceptionController {
	
	 @ExceptionHandler(value = CandidateNotFoundException.class)

	  public ResponseEntity<Object> exception(CandidateNotFoundException exception) {

	   return new ResponseEntity<>("Sorry! Requested Candidate Not Found!", HttpStatus.NOT_FOUND);

	  }
	 
	 @ExceptionHandler(value = InterviewNotFoundException.class)

	  public ResponseEntity<Object> exception(InterviewNotFoundException exception) {

	   return new ResponseEntity<>("Sorry! Requested interview Not Found!", HttpStatus.NOT_FOUND);

	  }
	 
	

}
