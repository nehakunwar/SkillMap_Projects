<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1" align="center">
<tr><th>EmpID</th><th>EmpName</th><th>City</th><th>Number</th><th>EmpEmail</th><th>qualification</th><th>password</th><th>Status</th></tr>
<c:forEach items="${requestScope.Employee}" var="res">
<tr>	
<td>${res.empId }</td>
<td>${res.empName }</td>
<td>${res.city }</td>
<td>${res.contactNumber}</td>
<td>${res.empEmail }</td>
<td>${res.empQualification }</td>
<td>${res.password }</td>

<td>${res.status} </td>

</tr>


</c:forEach>
</table>
</body>
</html>