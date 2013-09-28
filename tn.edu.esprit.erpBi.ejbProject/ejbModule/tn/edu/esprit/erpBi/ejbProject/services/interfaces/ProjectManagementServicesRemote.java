package tn.edu.esprit.erpBi.ejbProject.services.interfaces;

import java.util.List;

import javax.ejb.Remote;

import tn.edu.esprit.erpBi.ejbProject.domain.Employee;
import tn.edu.esprit.erpBi.ejbProject.domain.Project;

@Remote
public interface ProjectManagementServicesRemote {

	public void addProject(Project project);

	public void deleteProject(int idProject);

	public Project findProjectById(int idProject);

	public void updateProject(Project project);

	public List<Project> findAllProjects();

	public List<Project> findProjectsByDescription(String description);

	public List<Employee> findEmployeesByIdProject(int idProject);
}
