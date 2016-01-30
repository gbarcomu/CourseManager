package com.courseManager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.courseManager.controller.Info;
import com.courseManager.model.domain.Course;


@Component
@Scope(value="session")
public class ViewController {

	@Autowired
	Info info;
	
	public void setInfo(Info info) {
		
		this.info = info;
	}
	
	public List<Course> getCourses() {
		
		return info.getCourses();
	}
	
	public String sayHello() {
		
		return info.showMessage();
	}
}