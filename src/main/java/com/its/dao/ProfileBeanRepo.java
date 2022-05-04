package com.its.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.its.bean.ProfileBean;

public interface ProfileBeanRepo extends JpaRepository<ProfileBean, Integer>
{
	
}

