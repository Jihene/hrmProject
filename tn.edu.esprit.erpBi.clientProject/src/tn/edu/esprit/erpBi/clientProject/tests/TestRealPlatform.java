package tn.edu.esprit.erpBi.clientProject.tests;

import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.edu.esprit.erpBi.ejbProject.domain.Employee;
import tn.edu.esprit.erpBi.ejbProject.domain.Project;
import tn.edu.esprit.erpBi.ejbProject.services.interfaces.EmployeesServicesRemote;
import tn.edu.esprit.erpBi.ejbProject.services.interfaces.ProjectManagementServicesRemote;

public class TestRealPlatform {
	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		ProjectManagementServicesRemote projectManagementServicesRemote = (ProjectManagementServicesRemote) context
				.lookup("ejb:/tn.edu.esprit.erpBi.hrmProject/ProjectManagementServices!tn.edu.esprit.erpBi.ejbProject.services.interfaces.ProjectManagementServicesRemote");

		EmployeesServicesRemote employeesServicesRemote = (EmployeesServicesRemote) context
				.lookup("ejb:/tn.edu.esprit.erpBi.hrmProject/EmployeesServices!tn.edu.esprit.erpBi.ejbProject.services.interfaces.EmployeesServicesRemote");

		Project project = new Project("piDev");
		Employee employee = new Employee("rania");

		List<Employee> employees = new ArrayList<Employee>();
		employees.add(employee);

		project.linkEmployeesToThisProject(employees);

		projectManagementServicesRemote.addProject(project);
	}
}
