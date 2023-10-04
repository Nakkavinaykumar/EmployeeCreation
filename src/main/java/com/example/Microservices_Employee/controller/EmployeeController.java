package com.example.Microservices_Employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Microservices_Employee.model.Employee;
import com.example.Microservices_Employee.model.EmployeeDto;
import com.example.Microservices_Employee.serviceImpl.EmployeeServiceImpl;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeServiceImpl employeeServiceImpl;
	
	@PostMapping("/saveEmployee")
	public ResponseEntity<EmployeeDto> saveEmp(@RequestBody Employee employee) {
		
		EmployeeDto e=	employeeServiceImpl.saveEmployee(employee);
		return new ResponseEntity<EmployeeDto>(e,HttpStatus.OK); 
	}
	
	@GetMapping("/{emp_id}")
	public ResponseEntity<EmployeeDto> getEmplyee(@PathVariable(name="emp_id") long emp_id){
		EmployeeDto e= employeeServiceImpl.getEmployeeid(emp_id);
		return new ResponseEntity<EmployeeDto>(e,HttpStatus.OK);
	}

}
