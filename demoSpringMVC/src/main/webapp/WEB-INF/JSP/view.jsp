<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@page import="com.ait.Model.Student,java.util.ArrayList" isELIgnored="false"   %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Student CRUD Operation</h1>
<h2><a href="add">Add Student</a></h2>
	<table border="5">
		<tr>
		<th>ID</th>
		<th>Name</th>
		<th>Percent</th>
		<th>City</th>
		</tr>
		
		<c:forEach var="s1" items="${studlist}">
			<tr>
				<td>${s1.getSid() }</td>
				<td>${s1.getSname() }</td>
				<td>${s1.getPercent() }</td>
				<td>${s1.getCity() }</td>
				<td><a href="edit?id=${s1.getSid()}">Edit</a>
					<a href="delete?id=${s1.getSid()}">Delete</a>		
				</td>		
			</tr>
		</c:forEach>
		
	</table>
</body>
</html>