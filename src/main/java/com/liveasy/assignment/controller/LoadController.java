package com.liveasy.assignment.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.liveasy.assignment.model.Load;
import com.liveasy.assignment.repository.LoadRepository;
import com.liveasy.assignment.service.LoadService;

@RestController
@RequestMapping(value="/api/liveasy")
public class LoadController {

	 @Autowired
	 private LoadService lService;

	 @PostMapping("/load")
	    public ResponseEntity<String> addLoad(@RequestBody Load load) {
	        Load addNewLoad = lService.addLoad(load);
	        if(addNewLoad != null) {
				return ResponseEntity.ok("Load details added successfully");
			}
			else {
				return ResponseEntity.badRequest().body("Load details Not added ,failed !! ");
			}
	    }
     
//	 @GetMapping("/load")
//	    public ResponseEntity<List<Load>> getLoadsByShipperId(@RequestParam("shipperId") String shipperId) {
//	        List<Load> loads = lService.getLoadByShipperId(shipperId);
//	        return ResponseEntity.ok(loads);
//	    }
    
	 @GetMapping("/load/{loadId}") 
	    public ResponseEntity<Optional<Load>> getLoadById(@PathVariable Long loadId) {
	        Optional<Load> load = lService.getLoadById(loadId);
	        if (load != null) {
	            return ResponseEntity.ok(load);
	        } else {
	            return ResponseEntity.notFound().build();
	        }
	    }
	 @GetMapping("/load")
	 public ResponseEntity<List<Load>> getLoadsByShipperId(@RequestParam("shipperId") String shipperId) {
	     List<Load> loads = lService.getLoadByShipperId(shipperId);
	     if (loads.isEmpty()) {
	         return ResponseEntity.notFound().build();
	     } else {
	         return ResponseEntity.ok(loads);
	     }
	 }


	 
	 @PutMapping("/load/{loadId}")
	    public ResponseEntity<String> updateLoad(@PathVariable Long loadId, @RequestBody Load loadRequest) {
	        lService.updateLoad(loadId, loadRequest);
	        return ResponseEntity.ok("Load details updated successfully");
	    }

	    @DeleteMapping("/load/{loadId}")
	    public ResponseEntity<String> deleteLoad(@PathVariable Long loadId) {
	        lService.deleteLoad(loadId);
	        return ResponseEntity.ok("Load deleted successfully");
	    }
}
