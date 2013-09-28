package tn.edu.esprit.erpBi.clientProject.tests;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.edu.esprit.erpBi.ejbProject.services.interfaces.EmployeesServicesRemote;

public class TestDeleteEmployeeById {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	try {
			Context context = new InitialContext();
			EmployeesServicesRemote proxy = (EmployeesServicesRemote) context
					.lookup("ejb:/tn.edu.esprit.erpBi.ejbProject/EmployeesServices!tn.edu.esprit.erpBi.ejbProject.services.interfaces.EmployeesServicesRemote");

			proxy.deleteEmployeeById(1);
			
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
