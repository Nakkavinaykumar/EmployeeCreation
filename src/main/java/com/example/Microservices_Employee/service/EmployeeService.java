package com.example.Microservices_Employee.service;

import com.example.Microservices_Employee.model.Employee;
import com.example.Microservices_Employee.model.EmployeeDto;

public interface EmployeeService {
	
public EmployeeDto saveEmployee(Employee employee);
public EmployeeDto getEmployeeid(long id);

}
