package tn.edu.esprit.erpBi.ejbProject.services.interfaces;

import java.util.List;

import javax.ejb.Local;

import tn.edu.esprit.erpBi.ejbProject.domain.Employee;

@Local
public interface EmployeesServicesLocal {
	public void addEmployee(Employee employee);

	public Employee findEmployeeById(int idEmployee);

	public void deleteEmployeeById(int idEmployee);

	public void updateEmployee(Employee employee);
	
	public List<Employee> findAllEmployees();
}
