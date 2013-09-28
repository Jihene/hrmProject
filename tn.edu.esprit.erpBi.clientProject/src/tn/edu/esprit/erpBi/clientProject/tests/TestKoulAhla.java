package tn.edu.esprit.erpBi.clientProject.tests;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.edu.esprit.erpBi.ejbProject.services.interfaces.GreetingServicesRemote;

public class TestKoulAhla {

	public static void main(String[] args) {

		try {
			Context context = new InitialContext();
			GreetingServicesRemote proxy = (GreetingServicesRemote) context
					.lookup("ejb:/tn.edu.esprit.erpBi.ejbProject/GreetingServices!tn.edu.esprit.erpBi.ejbProject.services.interfaces.GreetingServicesRemote");
//tn.edu.esprit.erpBi.ejbProject/GreetingServices!tn.edu.esprit.erpBi.ejbProject.services.interfaces.GreetingServicesRemote
			proxy.koulAhla();
			
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
