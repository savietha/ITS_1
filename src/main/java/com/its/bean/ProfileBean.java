package com.its.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Table(name = "ITS_Profile")
@Entity
@Data
public class ProfileBean {
	
	@Id
	String candidateID;
	String firstName;
	String lastName;
	String dateOfBirth;
	String gender;
	String street;
	String location;
	String city;
	String state;
	String pincode;
	String mobileNo;
	String emailID;
}
