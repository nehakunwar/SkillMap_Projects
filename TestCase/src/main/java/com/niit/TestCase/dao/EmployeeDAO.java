package com.niit.TestCase.dao;

import java.util.List;



public interface EmployeeDAO {
	
	public boolean insertEmployee(Employee employee);
	public boolean updateEmployee(Employee employee);
	public Employee getEmployeeById(String id);
	public boolean deleteEmployee(String id);
	public List<Employee> listAllEmployees();
	public Employee getUserByUserNameAndPassword(String empname, String passord);
	public boolean approveEmployee(String eId);
	public List<Employee> listApprovedEmployees();
	public List<Employee> listNotApprovedEmployees();
	
}
