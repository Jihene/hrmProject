package tn.edu.esprit.erpBi.ejbProject.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Project
 * 
 */
@Entity
public class Project implements Serializable {

	private int idProject;
	private String descriptionProject;
	private static final long serialVersionUID = 1L;

	private List<Employee> employees;

	public Project() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getIdProject() {
		return this.idProject;
	}

	public void setIdProject(int idProject) {
		this.idProject = idProject;
	}

	public String getDescriptionProject() {
		return this.descriptionProject;
	}

	public void setDescriptionProject(String descriptionProject) {
		this.descriptionProject = descriptionProject;
	}

	@OneToMany(mappedBy = "project", cascade = { CascadeType.PERSIST,
			CascadeType.MERGE })
	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public Project(String descriptionProject) {
		super();
		this.descriptionProject = descriptionProject;
	}

	public void linkEmployeesToThisProject(List<Employee> employees) {
		this.employees = employees;
		for (Employee e : employees) {
			e.setProject(this);
		}
	}

}
