package com.courseManager.model;

import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.primefaces.validate.bean.AssertTrueClientValidationConstraint;

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
	public void shouldReturnNotNullIfTryToObtainAllCourses() {
		
		List<Course> courses = service.getAllCourses();
		
		// Number of active courses
		Assert.assertNotNull(courses);
		
		for (Course course : courses) {
			
			course.showData();
		}
	}
	
	@Test
	public void shouldReturnNotNullIfTryToObtainAllProfessors() {
		
		List<Professor> professors = service.getAllProfessors();
		
		Assert.assertNotNull(professors);
		
		for (Professor professor : professors) {
			
			professor.showData();
		}
	}
	
	@Test
	public void shouldIncreaseCoursesNumberIfInsertNewCourse() {
		
		Course course = new Course();
		
		course.mock();
		
		int coursesBeforInsertion = service.getAllCourses().size();
		
		service.insertCourse(course);
		
		Assert.assertTrue(service.getAllCourses().size() == coursesBeforInsertion + 1);
		
			
	}
}
