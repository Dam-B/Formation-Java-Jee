package fr.formation.inti.Bean;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import fr.formation.inti.entities.Employee;
import fr.formation.inti.service.EmployeeService;
import fr.formation.inti.service.IEmployeeService;


/**
 * Managed bean service for employee
 * Extends Employee service 
 * @author Ahmed Keceli
 *
 */

@ManagedBean
@SessionScoped
public class EmployeeBackBean extends EmployeeService implements Serializable{

	private static final long serialVersionUID = 1L;
	
	IEmployeeService service = new EmployeeService();
	List<Employee> employees = service.findAll();
	public IEmployeeService getService() {
		return service;
	}
	public void setService(IEmployeeService service) {
		this.service = service;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
	
	
	
}
