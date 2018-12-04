package com.javawebtutor;

import java.util.List;

public class Department {
	
	private String name;
	private List<Employee> employee;

	public Department(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Department [name=" + name + "]";
	}
	
	
	

}
