<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="insertUser" method="post">

<h1><b>Add User</b></h1>
		<table style="with: 50%" border="1" align="center">
 
			<tr>
				<td>Enter EmpCode</td><td><input type="text" name="empid" /></td>
			</tr>
				<tr>
				<td>Enter Employee Name</td><td><input type="text" name="empname" /></td>
			</tr>
			<tr>
				<td>Enter City</td>  <td><input type="text" name="city" /></td>
			</tr>
			<tr>
			<td>Enter MobileNumber</td><td><input type="text" name="number" /></td>
			</tr>
			<tr>
				<td>Enter your Qualification</td><td><input type="text" name="empqualification" /></td>
			</tr>
			<tr>
				<td>Enter Email ID </td><td><input type="text" name="email" /></td>
			</tr>
			<tr>
				<td>Enter password</td><td><input type="password" name="password" /></td>
			</tr>
			<tr> <td>Role Type</td>
                    <td><input type="radio" name="role" value="Manager" >
					    Manager</br>
                    <input type="radio" name="role" value="TechMentor" checked>
					    TechMentor</td>
                    
                </tr>
		</table>
		<input type="submit" value="register" /></form>

</body>
</html>