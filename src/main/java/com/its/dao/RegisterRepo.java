package com.its.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.its.bean.RegisterBean;

public interface RegisterRepo extends JpaRepository<RegisterBean, Integer>
{

	
}

