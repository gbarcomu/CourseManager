package com.courseManager.model;

import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.courseManager.model.domain.Course;
import com.courseManager.model.domain.Professor;
import com.courseManager.model.service.Service;

public class ServiceTest {

	private static Service service;
	
	@BeforeClass
	public static void setup() {
		
		service = new Service();
	}
	
	@AfterClass
	public static void teardown() {
		
		service = null;
	}
	
	@Test
	public void testGetAllCourses() {
		
		List<Course> courses = service.getAllCourses();
		
		// Number of active courses
		Assert.assertTrue(courses.size() == 5);
		
		for (Course course : courses) {
			
			course.showData();
		}
	}
	
	@Test
	public void testGetAllProfessors() {
		
		List<Professor> professors = service.getAllProfessors();
		
		// Number of active courses
		Assert.assertTrue(professors.size() == 7);
		
		for (Professor professor : professors) {
			
			professor.showData();
		}
	}
	
	@Test
	public void testInsertCourse() {
		
		Course course = new Course();
		
		course.mock();
		
		service.insertCourse(course);
		//TODO in progress	
	}
}
