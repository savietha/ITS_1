package com.its.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class TechPanelBean 
{
	@Id
   String techID;
   String techName;
   String subjects;
}
