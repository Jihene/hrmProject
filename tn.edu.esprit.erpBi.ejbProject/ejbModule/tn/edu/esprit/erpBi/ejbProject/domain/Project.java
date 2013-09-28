package tn.edu.esprit.erpBi.ejbProject.domain;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

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
	//classe project a plusieurs employee
	@OneToMany(mappedBy = "project",cascade=CascadeType.ALL)
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
   
	
	public void linkEmployeesToThisProject(List<Employee> employees){
		this.employees=employees;
		for(Employee e:employees){
			e.setProject(this);
		}
	}
}
