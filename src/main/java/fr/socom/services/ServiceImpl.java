package fr.socom.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.socom.dao.EmployeeRepository;
import fr.socom.entities.Employee;

@Service
public class ServiceImpl implements IService{

	@Autowired
	private EmployeeRepository employeeRepository;
	

	@Override
	public Employee SaveEmployees(Employee e) {
		if (!e.equals(null))
			return employeeRepository.save(e);
		else
		    return null;
	}

	@Override
	public Boolean deleteEmployees(Employee e) {
		if (employeeRepository.existsById(e.getId())) {
			employeeRepository.delete(e);
		    return true;
		}
		else
		    return false;
	}

	@Override
	public Employee updateEmployees(Employee e) {
		if (employeeRepository.existsById(e.getId())) {
			employeeRepository.save(e);
		    return e;
		} 
		else 
			return null; 
		} 
	
		

	@Override
	public List<Employee> getEmployees() {
		return employeeRepository.findAll();
	}
}
