package com.its.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.its.bean.CredentialsBean;


public interface CredentialRepo extends JpaRepository<CredentialsBean, Integer> {

}
