package com.example.Microservices_Employee.serviceImpl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.Microservices_Employee.Repository.EmployeeRepository;
import com.example.Microservices_Employee.model.Employee;
import com.example.Microservices_Employee.model.EmployeeDto;
import com.example.Microservices_Employee.model.project;
import com.example.Microservices_Employee.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	/*
	 * @Autowired private ProjectFeign projectFeign;
	 */
	@Autowired
	private RestTemplate restTemplate;
	
	private String baseUrl="http://PROJECT-SERVICE:8095/api/project/";
	
	@Override
	public EmployeeDto saveEmployee(Employee employee) {
		Employee saveemp=employeeRepository.save(employee);
		
//		Response response=projectFeign.getProjectbycode(saveemp.getEmployeeAssignedproject());
//		String body = response.body().toString();
//		Gson g = new Gson();
//		project p=g.fromJson(body,project.class);
		
//		List p=restTemplate.getForObject("http://localhost:8095/api/project/project_id/", List.class);
		project p=restTemplate.getForObject(baseUrl+saveemp.getEmployeeAssignedproject(),project.class);
		
		System.out.println("projectcode---------------------"+p);
		
		EmployeeDto empdto= new EmployeeDto();
		empdto.setId(saveemp.getId());
		empdto.setEmployeeName(saveemp.getEmployeeName());
		empdto.setEmployeeEmail(saveemp.getEmployeeEmail());
		empdto.setEmployeeBaseLocation(saveemp.getEmployeeBaseLocation());
		//empdto.setEmployeeAssignedproject(saveemp.getEmployeeAssignedproject());
		empdto.setProjectcode(p.getProjectcode());
		empdto.setProjectname(p.getProjectname());
		
		return empdto;
	}

	@Override
	public EmployeeDto getEmployeeid(long id) {
		Employee findemployee=	employeeRepository.findById(id).get();
		
//		Response response=restTemplate.getProjectbycode(findemployee.getEmployeeAssignedproject());
//		String body = response.body().toString();
//		Gson g = new Gson();
//		project p=g.fromJson(body,project.class);
		
		project p=restTemplate.getForObject(baseUrl+findemployee.getEmployeeAssignedproject(),project.class);
		
		System.out.println("projectcode---------------------"+p);
		EmployeeDto empdto= new EmployeeDto();
		empdto.setId(findemployee.getId());
		empdto.setEmployeeName(findemployee.getEmployeeName());
		empdto.setEmployeeEmail(findemployee.getEmployeeEmail());
		empdto.setEmployeeBaseLocation(findemployee.getEmployeeBaseLocation());
		empdto.setEmployeeAssignedproject(findemployee.getEmployeeAssignedproject());
		empdto.setProjectcode(p.getProjectcode());
		empdto.setProjectname(p.getProjectname());
		return empdto;
	}

}
