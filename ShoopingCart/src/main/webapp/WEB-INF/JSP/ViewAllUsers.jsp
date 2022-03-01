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
<h1 align="center">User Information</h1>
<table border="5" style="width:100%">
<tr>
<th>ID</th>
<th>Email Id</th>
<th>Mobile Number</th>
<th>User Name</th>
<th>Role</th>
</tr>

<c:forEach var="p1" items="${userlist}">
			<tr>
			<td>${p1.getId() }</td>
			<td>${p1.getEmailid() }</td>
			<td>${p1.getMobileno() }</td>
			<td>${p1.getUsername() }</td>
			<td>${p1.getRole().getRoleType() }</td>
			</tr>
</c:forEach>
</table>
</body>
</html>