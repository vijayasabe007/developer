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
<!--  
<form action="save">
	
Id:<input type="text" name="id" value="${product.getId()}">
<br>
Name:<input type="text" name="name" value="${product.getName()}">
<br>
Ram(GB):<input type="text" name="ram" value="${product.getRam()}">
<br> 
SSD(GB):<input type="text" name="ssd" value="${product.getSsd()}">
<br>
Graphics Card()GB):<input type="text" name="Graphicscard" value="${product.getGraphicsCard()}">
<br>
Price:<input type="text" name="price" value="${product.getPrice()}">
<br>
<input type="submit" value="save">
	
</form>
-->
<h1>Edit Information</h1>
<form action="update">
<table border="5" style="width:50%">
	<tr>
		<th>
			Id:<input type="text" name="id" value="${product.getId()}">
		</th>
	</tr>

	<tr>
		<th>
			Name:<input type="text" name="name" value="${product.getName()}">
	</tr>
	
	<tr>
		<th>
			Ram(GB):<input type="text" name="ram" value="${product.getRam()}">
		</th>
	</tr>
	
	<tr>
		<th>
			SSD(GB):<input type="text" name="ssd" value="${product.getSsd()}">
		</th>
	</tr>
	
	
	<tr>
		<th>
			Graphics_Card()GB):<input type="text" name="graphicsCard" value="${product.getGraphicsCard()}">
		</th>
	</tr>
	
	
	<tr>
		<th>
			Price:<input type="text" name="price" value="${product.getPrice()}">
		</th>
	</tr>
	
	<tr>
		<th>
			Quantity:<input type="text" name="quantity" value="${product.getQuantity()}">
		</th>
	</tr>
	
	<tr>
		<th>
			<input type="submit" value="update">
		</th>
	</tr>
	
</table>
</form>

</body>
</html>