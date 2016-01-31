package com.courseManager.controller;

import java.util.List;

import com.courseManager.model.domain.Course;
import com.courseManager.model.domain.Professor;

public interface Info {

	public List<Course> getCourses();
	public List<Professor> getProfessors();
	
	public String showMessage();
}
