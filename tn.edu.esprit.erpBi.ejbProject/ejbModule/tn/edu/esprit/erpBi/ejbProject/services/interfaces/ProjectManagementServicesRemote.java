package tn.edu.esprit.erpBi.ejbProject.services.interfaces;

import java.util.List;

import javax.ejb.Remote;

import tn.edu.esprit.erpBi.ejbProject.domain.Employee;
import tn.edu.esprit.erpBi.ejbProject.domain.Project;

@Remote
public interface ProjectManagementServicesRemote {

	public void addProject(Project project);
	
}
