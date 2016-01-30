package com.courseManager.controller.impl;

import org.springframework.stereotype.Component;


import com.courseManager.controller.Info;
import com.courseManager.model.service.Service;

@Component
public class InfoImpl implements Info {

	public String showMessage() {
		
		Service service = new Service();
		
		return "ISI" + service.getAllProfessors().size();
	}

}
