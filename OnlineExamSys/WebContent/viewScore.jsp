<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
int score = (int) session.getAttribute("score");
%>
<h1> Score: <%= score %> </h1>
<% session.invalidate(); %>
</body>
</html>