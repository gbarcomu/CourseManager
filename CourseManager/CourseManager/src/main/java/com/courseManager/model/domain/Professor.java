package com.courseManager.model.domain;

public class Professor {

	private Integer id;
	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void showData() {
		
		System.out.println("ID: " + id +
				", Name: " + name);
	}

}
