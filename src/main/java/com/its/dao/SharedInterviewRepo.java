package com.its.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.its.bean.Shared_interviews;

public interface SharedInterviewRepo extends JpaRepository<Shared_interviews, String>
{
	List<Shared_interviews> findByinterviewID(String interviewID);
}

