package com.example.Microservices_Employee.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class EmployeeDto {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String employeeName;
	private String employeeEmail;
	private long employeeAssignedproject;
	private String employeeBaseLocation;
	private long projectcode;
	private String projectname;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeEmail() {
		return employeeEmail;
	}
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}
	public long getEmployeeAssignedproject() {
		return employeeAssignedproject;
	}
	public void setEmployeeAssignedproject(long employeeAssignedproject) {
		this.employeeAssignedproject = employeeAssignedproject;
	}
	public String getEmployeeBaseLocation() {
		return employeeBaseLocation;
	}
	public void setEmployeeBaseLocation(String employeeBaseLocation) {
		this.employeeBaseLocation = employeeBaseLocation;
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
