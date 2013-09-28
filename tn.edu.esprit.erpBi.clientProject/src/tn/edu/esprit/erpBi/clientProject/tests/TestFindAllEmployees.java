package tn.edu.esprit.erpBi.clientProject.tests;

import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.edu.esprit.erpBi.ejbProject.domain.Employee;
import tn.edu.esprit.erpBi.ejbProject.services.interfaces.EmployeesServicesRemote;

public class TestFindAllEmployees {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			try {
			Context context = new InitialContext();
			EmployeesServicesRemote proxy = (EmployeesServicesRemote) context
					.lookup("ejb:/tn.edu.esprit.erpBi.ejbProject/EmployeesServices!tn.edu.esprit.erpBi.ejbProject.services.interfaces.EmployeesServicesRemote");
			
			List<Employee> employees=proxy.findAllEmployees();
			System.out.println("the size of the list is:"+ employees.size());
			
			
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
