package com.courseManager.model.service;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Utils {

	private static SqlSessionFactory factory; // SQL session
	
	private Utils() {
	}
	
	static {
		
		Reader reader = null;
		try {
			
			reader = Resources.getResourceAsReader("mybatis-config.xml");
			// Loads configuration in reader variable
			
		} catch (IOException e) {
			
			throw new RuntimeException(e.getMessage());
		}
		
		factory = new SqlSessionFactoryBuilder().build(reader);
	}
	
	public static SqlSessionFactory getSqlSessionFactory() {
		
		return factory;
	}
}
