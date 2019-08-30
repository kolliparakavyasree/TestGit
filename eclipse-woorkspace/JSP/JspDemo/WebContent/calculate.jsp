<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    errorPage="error.jsp" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	The sum of user provided numbers:
	<% 
		int no1 = Integer.parseInt(request.getParameter("n1")); 
		int no2 = Integer.parseInt(request.getParameter("n2"));
	%>
	
	<%= no1+no2 %>
	
	<jsp:forward page="demo.jsp"></jsp:forward>
</body>
</html>