package com.its.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.its.bean.*;

public interface SharedCandidateRepo extends JpaRepository<Shared_candidates, String>
{
	
}

