package fr.socom.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.socom.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

	//Employee findByIdEmployee(Long id);
}
