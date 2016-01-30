package com.courseManager.model.mappers;

import java.util.List;

import com.courseManager.model.domain.Course;
import com.courseManager.model.domain.Professor;

public interface Mapper {

	public List<Course> getAllCourses();
	public List<Professor> getAllProfessors();
	public void insertCourse(Course course);
}
