package tn.edu.esprit.erpBi.ejbProject.services.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.edu.esprit.erpBi.ejbProject.domain.Employee;
import tn.edu.esprit.erpBi.ejbProject.services.interfaces.EmployeesServicesLocal;
import tn.edu.esprit.erpBi.ejbProject.services.interfaces.EmployeesServicesRemote;

/**
 * Session Bean implementation class EmployeesServices
 */
@Stateless
public class EmployeesServices implements EmployeesServicesRemote,
		EmployeesServicesLocal {

	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public EmployeesServices() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addEmployee(Employee employee) {
		entityManager.persist(employee);

	}

	@Override
	public Employee findEmployeeById(int idEmployee) {

		return entityManager.find(Employee.class, idEmployee);
	}

	@Override
	public void deleteEmployeeById(int idEmployee) {
		entityManager.remove(findEmployeeById(idEmployee));

	}

	@Override
	public void updateEmployee(Employee employee) {
		entityManager.merge(employee);

	}

	@Override
	public List<Employee> findAllEmployees() {

		return entityManager.createQuery("select e from Employee e")
				.getResultList();
	}

}
