package com.courseManager.controller;

import java.util.List;

import com.courseManager.model.domain.Course;

public interface Info {

	public List<Course> getCourses();
	
	public String showMessage();
}
