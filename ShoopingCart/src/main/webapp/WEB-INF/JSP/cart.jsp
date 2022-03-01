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
<h1 align="center">Your Cart</h1>
<table border="5" style="width:100%">
	<tr>
		<th>Name</th>
		<th>Price</th>
		<th>Quantity</th>
	</tr>
	<c:forEach var="p" items="${cartlist}">
			<tr>			
				<td>${p.getProductname() }</td>
				<td>${p.getPrice() }</td>
				<td>${p.getQty() }</td>
				
	</c:forEach>
	</table>
	<h1 align="right"><a href="placeorder">Place Order</a></h1>
</body>
</html>