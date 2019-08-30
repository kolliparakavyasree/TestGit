<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<p>Your login successful</p>
	<% String s = request.getParameter("user");%>
	<p> Hi <% out.print(s); %>
</body>
</html>