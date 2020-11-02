package fr.socom.services;

import java.util.List;
import fr.socom.entities.Employee;


public interface IService {
	
	public  Employee SaveEmployees(Employee e);
	public Boolean deleteEmployees(Employee e);
	public Employee updateEmployees(Employee e);
	public List <Employee> getEmployees();

}
