package fr.socom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import fr.socom.dao.EmployeeRepository;
import fr.socom.entities.Employee;
import fr.socom.services.IService;

@Controller(value = "/api")
public class EmployeeController {
	
	
	@Autowired
	private IService iservice;
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@GetMapping(value = "/employees" )
	public  List <Employee> getListEmployee(){
		return iservice.getEmployees();
	}
	
	@PostMapping(value = "/employees" )
	public  List <Employee> getListEmployees(){
		Employee emp=new Employee();
		//emp=employeeRepository.findById(id).get();
		return iservice.getEmployees();
	}
	
	
	@PostMapping(value = "/employees/{id}" )
	public  Employee getEmployee(@PathVariable(value = "id") Long id){
		Employee emp=new Employee();
		emp=employeeRepository.findById(id).get();
		return emp;
	}

}
