package tn.edu.esprit.erpBi.ejbProject.services.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import tn.edu.esprit.erpBi.ejbProject.domain.Employee;
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

	@Override
	public void deleteProject(int idProject) {
		entityManager.remove(findProjectById(idProject));
	}

	@Override
	public Project findProjectById(int idProject) {
		return entityManager.find(Project.class, idProject);
	}

	@Override
	public void updateProject(Project project) {
		entityManager.merge(project);
	}

	@Override
	public List<Project> findAllProjects() {
		String jpql = "select p from Project p";
		Query query = entityManager.createQuery(jpql);
		return query.getResultList();
	}

	@Override
	public List<Project> findProjectsByDescription(String description) {
		String jpql = "select p from Project p where p.descriptionProject =:param";
		Query query = entityManager.createQuery(jpql);
		query.setParameter("param", description);
		return query.getResultList();
	}

	@Override
	public List<Employee> findEmployeesByIdProject(int idProject) {
		String jpql = "select e from Employee e where e.project.idProject =:param";
		Query query = entityManager.createQuery(jpql);
		query.setParameter("param", idProject);
		return query.getResultList();
	}
}
