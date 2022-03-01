<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@page import="com.ait.model.*,java.util.ArrayList" isELIgnored="false"   %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">Welcome Admin</h1>
	
	<h2><a href="addproduct">Add Product</a></h2>
	<h2><a href="signin">Log Out</a></h2>
	<table border="5" style="width:100%">
		<tr>
		<th>ID</th>
		<th>Name</th>
		<th>Ram(GB)</th>
		<th>SSD(GB)</th>
		<th>Graphics_Card(GB)</th>
		<th>Price</th>
		<th>Quanity</th>
		<th>Actions</th>
		</tr>
		
		<c:forEach var="p1" items="${productlist}">
			<tr>
				<td>${p1.getId() }</td>
				<td>${p1.getName() }</td>
				<td>${p1.getRam() }</td>
				<td>${p1.getSsd() }</td>
				<td>${p1.getGraphicsCard() }</td>
				<td>${p1.getPrice() }</td>
				<td>${p1.getQuantity() }
				<td><a href="edit?id=${p1.getId()}">Edit</a>
					<a href="delete?id=${p1.getId()}">Delete</a>		
				</td>		
			</tr>
		</c:forEach>
		<tr>
		
		</tr>
	
</body>
</html>