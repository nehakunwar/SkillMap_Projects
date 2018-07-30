package com.niit.HibernateAnotation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="empdetails")
public class EmployeeDetails {
	    @Id
		int id;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		@Column
		String firstName;
		@Column
		String lastName;
		int salary;
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		
		

}
