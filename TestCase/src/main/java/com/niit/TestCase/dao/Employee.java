package com.niit.TestCase.dao;

public class Employee {
	String empId;
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", city=" + city + ", contactNumber="
				+ contactNumber + ", empEmail=" + empEmail + ", empQualification=" + empQualification + ", password="
				+ password + ", role=" + role + ", status=" + status + "]";
	}
	String empName;
	String city;
	String contactNumber;
	String empEmail;
	String empQualification;
	String password;
	String role;
	int status;
	public void setRole(String role) {
		this.role = role;
	}
	
	public int getStatus() {
		return status;
	}








	public String getRole() {
		return role;
	}



	
	



	public Employee(String empId, String empName, String city, String contactNumber, String empEmail,
			String empQualification, String password,String role,int status) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.city = city;
		this.contactNumber = contactNumber;
		this.empEmail = empEmail;
		this.empQualification = empQualification;
		this.password = password;
		this.role=role;
		this.status=status;
	}
	


	public void setStatus(int status) {
		this.status = status;
	}
	public Employee() {
		
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	public String getEmpQualification() {
		return empQualification;
	}
	public void setEmpQualification(String empQualification) {
		this.empQualification = empQualification;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}