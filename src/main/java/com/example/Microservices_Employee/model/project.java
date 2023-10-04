package com.example.Microservices_Employee.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


public class project {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private long projectcode;
	private String projectname;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getProjectcode() {
		return projectcode;
	}
	public void setProjectcode(long projectcode) {
		this.projectcode = projectcode;
	}
	public String getProjectname() {
		return projectname;
	}
	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}
	
	

}
