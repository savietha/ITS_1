package com.its.controller;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.its.bean.*;
import com.its.dao.CredentialRepo;
import com.its.dao.RegisterRepo;
import com.its.service.AdminserviceImp;

@RestController
public class LoginRegisterController 
{
@Autowired
CredentialRepo cred;
@Autowired
RegisterRepo prof;
@Autowired
AdminserviceImp adminservice;


@PostMapping(value="/its/register")

public String registerUser(@RequestBody RegisterBean newUser) {

     CredentialsBean c = new CredentialsBean();
     
	 Random rand = new Random();
	 int resRandom = rand.nextInt((9999 - 100) + 1) + 10;
	 String userid = newUser.getFirstName().substring(0,2) + Integer.toString(resRandom);
	 newUser.setUserID(userid);
	 
	 
	 c.setUserID(newUser.getUserID());
	 c.setLoginStatus(0);
	 c.setPassword(newUser.getPassword());
	 
	 
	 if(newUser.getUsertype().equals("tech"))
	 {
		 c.setUserType("T");
	 }
	 else if(newUser.getUsertype().equals("hr"))
	 {
		 c.setUserType("H");
	 }


	prof.save(newUser);
    cred.save(c);
    
    System.out.println(c.getUserID());
    return "Registered_successfully";
}


@PutMapping(value="/its/login")
public String loginUser(@RequestBody login login) {
	
     List<CredentialsBean> users = cred.findAll();
     for (CredentialsBean cb : users) {
    	if (cb.getUserID().equals(login.getUserID()) && cb.getPassword().equals(login.getPassword())) 
        {
        	if(cb.getLoginStatus()==0)
        	{
        		cb.setLoginStatus(1);
        	}
            cred.save(cb);
            return "Login succesfull";
        }
     }
    return "Username or password is incorrect";
}


@PutMapping("/its/logout")
public String logUserOut(@RequestBody login login) {
    List<CredentialsBean> users = cred.findAll();
    for (CredentialsBean cb : users) {
    	if (cb.getUserID().equals(login.getUserID()) && cb.getPassword().equals(login.getPassword())) 
        {
        	if(cb.getLoginStatus()==1)
        	{
        		cb.setLoginStatus(0);
        	}
            cred.save(cb);
            return "Logout_Successfully";
        }
    }
    return "Error logging out!!";
}

@PutMapping(path="/its/changepassword")
public String ChangePassword(@RequestBody login login) {
	List<CredentialsBean> users = cred.findAll();
    for (CredentialsBean cb : users) {
    	if (cb.getUserID().equals(login.getUserID())) 
        {
         		cb.setPassword(login.getPassword());
        		cred.save(cb);
        }
            
            return "Updated_successfully";
    }
    
    return "Error updating the password!!";   
	}
    
}



