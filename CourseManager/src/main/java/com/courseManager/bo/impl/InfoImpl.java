package com.courseManager.bo.impl;

import org.springframework.stereotype.Service;

import com.courseManager.bo.Info;

@Service
public class InfoImpl implements Info {

	public String showMessage() {
		
		return "HOLA HOLA NO VENGAS SOLA";
	}

}
