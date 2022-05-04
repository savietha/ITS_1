package com.its.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.its.bean.InterviewScheduleBean;


public interface InterviewRepo extends JpaRepository<InterviewScheduleBean, Integer>
{
	List<InterviewScheduleBean> findByinterviewID(String interviewID);
}
