package com.its.bean;


import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Table;

import lombok.Data;


@Entity
@Data
@Table(name="Register")
public class RegisterBean {
	
	@Id
	private String userID;
	private String firstName;	
	private String lastName;	
	private String dateOfBirth;
	private String gender;
	private String location;	
	private String mobileNo;
	private String emailID;	
	private String password;
	private String usertype;
}
