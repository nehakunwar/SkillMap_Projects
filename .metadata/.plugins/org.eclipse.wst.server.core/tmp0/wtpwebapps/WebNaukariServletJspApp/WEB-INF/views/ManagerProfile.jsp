<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body>
<h2 align="center" style="color:blue;"><b >Skill MAp</b></h2>
 
 <c:set var="name" value="${sessionScope.employeeSession}"></c:set>
  <h5 align="right" style="color:blue;">Welcome <c:out value="${name.empName}"></c:out></h5> <h5 align="right" style="color:black;"><a href="logout"> Sign Out</a></h5>
 
 <!--  <a href="getAllTechMentor?role=M">All TechMentor</a>-->
 <a href="getAllTechMentor">All TechMentor</a>
</body>

</html>