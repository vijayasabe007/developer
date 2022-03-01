
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@page import="com.ait.Model.Student,java.util.ArrayList" isELIgnored="false"   %>
   <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to Spring MVC Model</h1>
	<table border="2">
		<tr>
		<th>ID</th>
		<th>Name</th>
		<th>Percent</th>
		<th>City</th>
		</tr>
		
		<c:forEach var="s1" items="${studentlist}">
			<tr>
				<td>${s1.getSid() }</td>
				<td>${s1.getSname() }</td>
				<td>${s1.getPercent() }</td>
				<td>${s1.getCity() }</td>
			</tr>
		</c:forEach>
		
	</table>
	<!-- 	<%/*
		Student ss=(Student)request.getAttribute("sobj");
		out.println("Name  "+ ss.getSname());
		out.println("Percent  "+ss.getPercent());
		out.println("City  "+ss.getCity());*/
	%>
	<h1>${sobj.getSname() }</h1>
	 
	<%  ArrayList<Student> al=(ArrayList<Student>)request.getAttribute("studentlist");%>
	<table border="2">
		<tr>
		<th>ID</th>
		<th>Name</th>
		<th>Percent</th>
		<th>City</th>
		</tr> 
	<%for(Student s1:al)
		{
		%>
		<tr>
			<td><%=s1.getSid() %></td>
			<td><%=s1.getSname()%></td>
			<td><%=s1.getPercent() %></td>
			<td><%=s1.getCity() %></td>
		</tr>
		<%} %>
	</table>
	-->
</body>
</html>