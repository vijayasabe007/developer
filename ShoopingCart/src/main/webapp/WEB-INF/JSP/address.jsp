<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
input[type=text], input[type=password] {
  width: 50%;
  padding: 15px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
}
</style>
</head>
<body>


<h1>Enter Delivery Address</h1>
<form action="order">	
	<label for="name"><b>Name</b></label>
    <input type="text" placeholder="Enter Name" name="name" required>  
    <br>
    <label for="mobileno"><b>Mobile Number</b></label>
    <input type="number" placeholder="Enter Mobile Number" name="mobileno" required>  
    <br>
    <br>
    <label for="address"><b>Address</b></label>
    <input type="text" placeholder="Enter Area & Street" name="address" required>
    <br>
    <label for="city"><b>City</b></label>
    <input type="text" placeholder="Enter City" name="city" required>
    <br>
    <label for="state"><b>State</b></label>
    <input type="text" placeholder="Enter State" name="state" required>
    <br>
    
    <input type="submit" value="Save & Delivery Here">
    </form>
</body>
</html>