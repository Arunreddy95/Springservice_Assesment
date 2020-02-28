package com.groupon.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.groupon.api.domain.RequestModel;
import com.groupon.api.service.GroupOnService;


@RestController
public class GroupOnController {
	
	@Autowired
	GroupOnService groupOnService;
	
	@PostMapping("/company")
	public void createCompany(@RequestBody RequestModel groupOn) {
		groupOnService.save(groupOn);
	}
	
	@PutMapping("/company")
	public void updateCompany(@RequestBody RequestModel groupOn) {
		groupOnService.update(groupOn);
	}
	
	@DeleteMapping("/company")
	public void deleteCompany(@RequestBody RequestModel groupOn) {
		groupOnService.delete(groupOn);
	}
	
	@GetMapping("/company")
	public String[] getCompanies() {
		return groupOnService.getAll();
	}

}
