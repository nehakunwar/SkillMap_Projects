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
<c:set var="id" value="${requestScope.employee}"/>
 <h1 style="color:blue;" align="center">SkillMap</h1><br/>
 <h5 align="right" style="color:black;"><a href="logout"> Sign Out</a></h5>
<h4 style="color:green;" align="center">Approval request generated for employee <c:out value="${id.empId}"/></h4><br/><br/>
 <br/> <h4 style="color:blue;"align="center">Thank You</h4>
</body>
</html>