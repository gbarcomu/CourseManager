package com.courseManager.model.domain;

public class Course {

	private String title;
	private boolean isActive;
	private int level;
	private int hours;
	private int idProfessor;
	
	public void mock() {
		
		this.title = "MockCourse";
		this.isActive = false;
		this.level = 1;
		this.hours = 10;
		this.idProfessor = 1;
	}
		
	public int getIdProfessor() {
		return idProfessor;
	}
	public void setIdProfessor(int idProfessor) {
		this.idProfessor = idProfessor;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
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
	
	public void showData() {
		
		System.out.println("Title: " + title +
				", Level: " + level + ", Hours: " + hours + ", Professor: " + idProfessor);
	}
}
