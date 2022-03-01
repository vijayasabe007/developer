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
<div align="center";> 
<h1>Our Products are like:</h1>
<h2>1. Lightweight, powerful, built to last.</h2>
<h2>2. A laptop you can count on!</h2>
<h2>3. Relax. Your laptop will handle it for you.</h2>
</div>
<br>
<br>
<table border="5" style="width:100%">
		<tr>
		<th>ID</th>
		<th>Name</th>
		<th>Ram(GB)</th>
		<th>SSD(GB)</th>
		<th>Graphics_Card(GB)</th>
		<th>Price</th>
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
				 
				<td><a href="addtocart?id=${p1.getId()}">Add to Cart</a>
							
				</td>		
			</tr>
		</c:forEach>
		
		<h4 align="center">
<h2 align="right"><a href="viewcart">View Cart</a></h2>
<h2 align="right"><a href="signin">Log Out</a></h2>
</h4>
</body>
</html>