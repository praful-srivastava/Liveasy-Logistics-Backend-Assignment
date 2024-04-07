package com.liveasy.assignment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.liveasy.assignment.model.Load;

public interface LoadRepository extends JpaRepository<Load, Long>{

	public List<Load> findByShipperId(String shipperId);
	
}
