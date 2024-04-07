package com.liveasy.assignment.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liveasy.assignment.model.Load;
import com.liveasy.assignment.repository.LoadRepository;

import jakarta.transaction.Transactional;



@Service
@Transactional
public class LoadService {
	@Autowired
	public LoadRepository loadRepo;
	
	public Load addLoad(Load load) {
        return loadRepo.save(load);
    }
	
	public List<Load> getLoadByShipperId(String ShipperId){
		return loadRepo.findByShipperId(ShipperId);
		
	}
	
	public Optional<Load> getLoadById(Long loadId) {
		return loadRepo.findById(loadId);
	}
	
	public void updateLoad(Long loadId, Load updatedLoad) {
        if (loadRepo.existsById(loadId)) {
            updatedLoad.setId(loadId);
            loadRepo.save(updatedLoad);
        }
    }
	public void deleteLoad(Long loadId) {
        loadRepo.deleteById(loadId);
    }
	
}
