<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<form method="get" action="hello">
		Enter Name:<input type="text" name="user"><br>
		<button>Login</button>
	</form>
		<% 
			String s=request.getParameter("user"); 
			if(s==null || (!s.equals("admin"))  ){
			out.print("You are not an admin");
		} %>
	
</body>
</html>