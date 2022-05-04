package com.its.bean;

import javax.persistence.*;

import lombok.Data;


@Table(name = "Credentials")
@Entity
@Data
public class CredentialsBean {
	
	@Id
	String userID;
	String password;
	String userType;
	int loginStatus;

}
