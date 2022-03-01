<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!--  
	<form  action="save">
	Name:<input type="text" name="name">
	<br>
	Ram(GB):<input type="text" name="ram">
	<br>
	SSD(GB):<input type="text" name="ssd">
	<br>
	Graphics_Card(GB):<input type="text" name="graphicscard">
	<br>
	Price:<input type="text" name="price">
	<br>
	
	
	
	</form>
	-->
	<h1>Add New Products</h1>
	<form action="save">
	<table  border="5" style="width:50%" >
		<tr>
			<th>
				Name:<input type="text" name="name">
			</th>	
		</tr>
		
		<tr>
			<th>
				Ram(GB):<input type="text" name="ram">
			</th>	
		</tr>
		
		<tr>
			<th>
				SSD(GB):<input type="text" name="ssd">
			</th>	
		</tr>
		
		<tr>
			<th>
				Graphics_Card(GB):<input type="text" name="graphicsCard">
			</th>	
		</tr>
		
		<tr>
			<th>
				Price:  <input type="text" name="price">
			</th>	
		</tr>
		
		<tr>
			<th>
				Quantity:<input type="number" name="quantity">
			</th>	
		</tr>
		
		<tr>
			<th>
				<input type="submit" value="Save">		
			</th>	
		</tr>
		
	</table>
	</form>
</body>
</html>