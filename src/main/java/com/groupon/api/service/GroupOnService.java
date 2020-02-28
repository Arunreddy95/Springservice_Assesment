package com.groupon.api.service;

import org.springframework.stereotype.Service;

import com.groupon.api.domain.RequestModel;
import com.groupon.api.shared.GroupOnCustomList;

@Service
public class GroupOnService {
	
	GroupOnCustomList<RequestModel> groupOnList = new GroupOnCustomList<>();
	
	public void save(RequestModel groupOn) {
		groupOnList.add(groupOn.getCompanyName());	
	}
	
	public void delete(RequestModel groupOn) {
		groupOnList.removeByName(groupOn.getCompanyName());		
	}
	
	public void update(RequestModel groupOn) {
		groupOnList.updateByName(groupOn.getOldCompanyName(), groupOn.getCompanyName());		
	}
	
	public String[] getAll() {
		return groupOnList.getAll();
	}

}
