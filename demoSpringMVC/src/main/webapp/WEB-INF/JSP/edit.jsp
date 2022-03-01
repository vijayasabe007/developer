<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 
<form action="save">
Id:<input type="text" name="id" value="${stud.getSid()}">
<br>
Name:<input type="text" name="name" value="${stud.getSname()}">
<br>
Percent:<input type="text" name="percent" value="${stud.getPercent()}">
<br> 
City:<input type="text" name="city" value="${stud.getCity()}">
<br>
<input type="submit" value="save">
</form>



</body>
</html>