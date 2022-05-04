package com.its.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class HRPanelBean 
{
	@Id
   String empHRID;
   String empHRName;
}
