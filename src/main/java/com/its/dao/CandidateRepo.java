package com.its.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.its.bean.CandidateBean;



public interface CandidateRepo extends JpaRepository<CandidateBean, String>
{
	  List<CandidateBean> findByPrimarySkills(String skills);
	  List<CandidateBean> findByExperience(float experience);
	  List<CandidateBean> findByQualification(String qualification);
	  
	
}
