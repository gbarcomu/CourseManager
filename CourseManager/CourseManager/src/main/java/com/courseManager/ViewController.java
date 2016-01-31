package com.courseManager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.courseManager.controller.Info;
import com.courseManager.model.domain.Course;
import com.courseManager.model.domain.Professor;


@Component
@Scope(value="session")
public class ViewController {

	@Autowired
	Info info;
	
	private Professor professor;
	
	Course courseToInsert;
	
	public void insertCourse() {
		
		System.out.println("Inserting cool stuff");
	}


	public Professor getProfessor() {
		return professor;
	}


	public void setProfessor(Professor professor) {
		this.professor = professor;
	}


	public void setInfo(Info info) {
		
		this.info = info;
	}
	
	public List<Course> getCourses() {
		
		return info.getCourses();
	}
	
	public List<Professor> getProfessors() {
		
		return info.getProfessors();
	}
	
	public String sayHello() {
		
		return info.showMessage();
	}
}