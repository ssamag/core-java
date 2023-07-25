package com.java.objcreation;

import java.io.Serializable;

public class Student implements Serializable {

	/**
	* 
	*/
	private static final long serialVersionUID = 7571176302979361642L;

	private String name;
	private String college;

	public Student() {
		super();
	}

	public Student(String name, String college) {
		super();
		this.name = name;
		this.college = college;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}
}