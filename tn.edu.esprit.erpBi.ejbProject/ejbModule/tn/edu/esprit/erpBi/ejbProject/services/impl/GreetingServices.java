package tn.edu.esprit.erpBi.ejbProject.services.impl;

import javax.ejb.Stateless;

import tn.edu.esprit.erpBi.ejbProject.services.interfaces.GreetingServicesLocal;
import tn.edu.esprit.erpBi.ejbProject.services.interfaces.GreetingServicesRemote;

@Stateless
public class GreetingServices implements GreetingServicesRemote,
		GreetingServicesLocal {

	@Override
	public void koulAhla() {
		System.out.println("3aslema ya 7memma");

	}

}
