package tn.edu.esprit.erpBi.ejbProject.services.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.edu.esprit.erpBi.ejbProject.domain.Project;
import tn.edu.esprit.erpBi.ejbProject.services.interfaces.ProjectManagementServicesLocal;
import tn.edu.esprit.erpBi.ejbProject.services.interfaces.ProjectManagementServicesRemote;

/**
 * Session Bean implementation class ProjectManagementServices
 */
@Stateless
public class ProjectManagementServices implements
		ProjectManagementServicesRemote, ProjectManagementServicesLocal {

	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public ProjectManagementServices() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addProject(Project project) {
		entityManager.persist(project);
	}

}
