package com.its.bean;

import javax.persistence.Entity;
import javax.persistence.Id;


import lombok.Data;

@Entity
@Data
public class login {
	
	@Id
	String userID;
	String password;
}
