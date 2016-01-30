package com.courseManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.courseManager.controller.Info;


@Component
@Scope(value="session")
public class ViewController {

	@Autowired
	Info info;
	
	public void setInfo(Info info) {
		
		this.info = info;
	}
	
	public String sayHello() {
		
		return info.showMessage();
	}
}