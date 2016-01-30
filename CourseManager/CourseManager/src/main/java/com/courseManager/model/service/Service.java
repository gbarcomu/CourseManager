package com.courseManager.model.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.courseManager.model.domain.Course;
import com.courseManager.model.domain.Professor;
import com.courseManager.model.mappers.Mapper;

public class Service {

	public List<Course> getAllCourses() {

		SqlSession sqlSession = Utils.getSqlSessionFactory().openSession();

		try {

			Mapper mapper = sqlSession.getMapper(Mapper.class);
			return mapper.getAllCourses();
		} finally {

			sqlSession.close();
		}
	}
	
	public List<Professor> getAllProfessors() {

		SqlSession sqlSession = Utils.getSqlSessionFactory().openSession();

		try {

			Mapper mapper = sqlSession.getMapper(Mapper.class);
			return mapper.getAllProfessors();
		} finally {

			sqlSession.close();
		}
	}
	
	public void insertCourse(Course course) {

		SqlSession sqlSession = Utils.getSqlSessionFactory().openSession();

		try {

			Mapper mapper = sqlSession.getMapper(Mapper.class);
			mapper.insertCourse(course);
			sqlSession.commit();

		} finally {

			sqlSession.close();
		}
	}
}
