package com.courseManager.controller.impl;

import java.util.List;

import com.courseManager.controller.Info;
import com.courseManager.model.domain.Course;
import com.courseManager.model.domain.Professor;
import com.courseManager.model.service.Service;

@org.springframework.stereotype.Service
public class InfoImpl implements Info {

	
	
	public String showMessage() {
		
		Service service = new Service();
		
		return "ISI" + service.getAllProfessors().size();
	}

	public List<Course> getCourses() {
		
		Service service = new Service();
		
		return service.getAllCourses();
	}

	public List<Professor> getProfessors() {
		
		Service service = new Service();
		
		return service.getAllProfessors();
	}

	public void insertCourse(Course course) {
		
		Service service = new Service();
		
		service.insertCourse(course);
	}
}
