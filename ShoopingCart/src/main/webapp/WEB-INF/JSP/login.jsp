<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isELIgnored="false" %>
    
    <%@ page import="javax.servlet.RequestDispatcher" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- 
<%
if(session!=null)
{
RequestDispatcher rd=request.getRequestDispatcher("home");
rd.forward(request,response);
}
%>
 --%><H3>${status}</H3>
<h1 align="center">Welcome</h1>

<form action="validate" >
 <table  align="center" border="5"  >

<tr>
<th height="34">username</th>
<td><input type="text" name="username"/></td>
</tr>

<tr>
	<th height="33">password</th>
		<td><input type="password" name="password"/></td>
</tr>

<tr>
	<td colspan="2"><input type="submit" value="submit"></td>
</tr>
</table>
</form>

</body>
</html>