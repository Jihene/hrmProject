package tn.edu.esprit.erpBi.clientProject.tests;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.edu.esprit.erpBi.ejbProject.domain.Employee;
import tn.edu.esprit.erpBi.ejbProject.domain.Project;
import tn.edu.esprit.erpBi.ejbProject.services.interfaces.EmployeesServicesRemote;
import tn.edu.esprit.erpBi.ejbProject.services.interfaces.ProjectManagementServicesRemote;

public class TestInitDb {
	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		ProjectManagementServicesRemote projectManagementServicesRemote = (ProjectManagementServicesRemote) context
				.lookup("ejb:/tn.edu.esprit.erpBi.ejbProject/ProjectManagementServices!tn.edu.esprit.erpBi.ejbProject.services.interfaces.ProjectManagementServicesRemote");

		EmployeesServicesRemote employeesServicesRemote = (EmployeesServicesRemote) context
				.lookup("ejb:/tn.edu.esprit.erpBi.ejbProject/EmployeesServices!tn.edu.esprit.erpBi.ejbProject.services.interfaces.EmployeesServicesRemote");

		Employee employee = new Employee("jihene");
		Employee employee2 = new Employee("hedy");
		Employee employee3 = new Employee("med");

		employeesServicesRemote.addEmployee(employee);
		employeesServicesRemote.addEmployee(employee2);
		employeesServicesRemote.addEmployee(employee3);

		Project project = new Project("pidev");
		Project project2 = new Project("erpBiProject");

		projectManagementServicesRemote.addProject(project);
		projectManagementServicesRemote.addProject(project2);

	}
}
