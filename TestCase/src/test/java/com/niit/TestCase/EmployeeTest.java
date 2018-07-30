package com.niit.TestCase;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.niit.TestCase.dao.Employee;
import com.niit.TestCase.dao.EmployeeDAO;
import com.niit.TestCase.dao.EmployeeDAOImpl;

public class EmployeeTest {
	private  EmployeeDAO empdao;
	private  Employee employee=new Employee();
	@Before
	public void setUp()
	{
		empdao=new EmployeeDAOImpl();
	}
	@After
	public void tearDawn()
	{
		empdao=null;
	}
	
  
   @Test
	public void testCreateUser() {
        //EmployeeDAO empdao=new EmployeeDAOImpl();
		//Employee employee=new Employee();
		employee.setEmpId("E12");
		employee.setCity("udaipur");
		employee.setContactNumber("346634");
		employee.setEmpEmail("punita@niit.com");
		employee.setEmpName("punita");
		employee.setEmpQualification("Mtech");
		employee.setPassword("password2");
		employee.setRole("Manager");
		empdao.insertEmployee(employee);
		assertNotNull("Creating of user failed.",empdao.getEmployeeById("E12"));
		
		
		
	}

@Ignore
	@Test
	public void testUpdateEmployee() {
		//EmployeeDAO empdao=new EmployeeDAOImpl();
		//Employee employee=new Employee();
		empdao.getEmployeeById("E11");
		employee.setCity("surat");
		empdao.updateEmployee(employee);
		assertEquals("password2",empdao.getEmployeeById("E11").getPassword());
	
	}
	@Ignore
	@Test
	public void testGetListOfEmployee() {
		//EmployeeDAO empdao=new EmployeeDAOImpl();
		
		List<Employee> emplist=empdao.listAllEmployees();
		//assertNotNull("Retrieval of users failed.", emplist.size());
		assertEquals(7, emplist.size());
	}
   @Ignore
	@Test
	public void testDelete()
	{
		Employee empId=empdao.getEmployeeById("E10");
		String id=empId.getEmpId();
		//empdao.deleteEmployee(id);
		//assertNotNull("Retrieval of user failed.", employee);
		assertEquals(true, empdao.deleteEmployee(id));
	}

	@Test
	public void testDeleteNotNull()
	{
		Employee empId=empdao.getEmployeeById("E12");
		String id=empId.getEmpId();
		//empdao.deleteEmployee(id);
		assertNotNull("Retrieval of user failed.", empdao.deleteEmployee(id));
		
	}
	@Ignore
	@Test
	public void testGetUser() {
		//Employee employee=new Employee();
		EmployeeDAO empdao=new EmployeeDAOImpl();
		employee=empdao.getEmployeeById("E08");
	
		assertNotNull("Retrieval of user failed.", employee);
	}

	

}
