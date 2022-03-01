<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<style>
input[type=text], input[type=password] {
  width: 50%;
  padding: 15px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
}

.button1 {background-color:red; padding: 14px 20px;width: 25%;} 
.button2 {background-color:green ; padding: 14px 20px;width: 25%;} 
 

</style>
<body>
	<h1>Sign Up</h1>
    <p>Please fill in this form to create an account.</p>
	<form action="saveuser">
	
	<label for="email"><b>Email</b></label>
    <input type="text" placeholder="Enter Email" name="email" required>  
    <br>
    <label for="mobileno"><b>Mobile Number</b></label>
    <input type="number" placeholder="Enter Mobile Number" name="mobileno" required>  
    <br>
    <label for="username"><b>User Name</b></label>
    <input type="text" placeholder="Enter User Name" name="username" required>
    <br>
    <label for="password"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="password" required>
    <br>
    
	 
	 <input type="submit" value="Save">
	 
	</form>
	
	
	<!--  
	<table  border="10" style="width:60%">
		<tr>
			<th>
					Email_ID:<input type="email" name="email">
				</th>
		</tr>
		
		<tr>
			<th>
					Mobile_No:<input type="text" name="no">
			</th>
		</tr>
		
		<tr>
			<th>
					User_Name:<input type="text" name="username">
			</th>
		</tr>
		
		<tr>
			<th>
					Password:<input type="password" name="password">
			</th>
		</tr>
		
		<tr>
			<th>
					Mobile_No:<input type="text" name="no">
			</th>
		</tr>
		
		<tr>
			<th>
					<input type="submit" value="Save">
			</th>
		</tr>
		
		
	</table>
	-->
	
	<!-- 
    <button class="button button1">Cancel</button>
	<button class="button button2">Sign Up</button>
	 -->
</body>
</html>