package com.courseManager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.courseManager.model.domain.Course;

@Component
@Scope(value="session")
public class InsertionBean {
	
	@Autowired
	Info info;
	
	boolean isActive;
	private int level;
	private int hours;
	private String title;
	
	public void insertCourse() {
		
		Course course = new Course();
		
		course.setActive(isActive);
		course.setHours(hours);
		course.setLevel(level);
		course.setTitle(title);
		course.setIdProfessor(1);
		
		info.insertCourse(course);
	}
	
	public Info getInfo() {
		return info;
	}
	public void setInfo(Info info) {
		this.info = info;
	}
	public boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
