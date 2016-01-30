package com.courseManager.controller.impl;

import java.util.List;

import org.springframework.stereotype.Component;


import com.courseManager.controller.Info;
import com.courseManager.model.domain.Course;
import com.courseManager.model.service.Service;

@Component
public class InfoImpl implements Info {

	
	
	public String showMessage() {
		
		Service service = new Service();
		
		return "ISI" + service.getAllProfessors().size();
	}

	public List<Course> getCourses() {
		
		Service service = new Service();
		
		return service.getAllCourses();
	}
}
