<%@page import="com.lt.model.Option"%>
<%@page import="java.util.List"%>
<%@page import="com.lt.model.Question"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="AnswerCheckServlet">
<%
Question nextQuestion = (Question) session.getAttribute("nextQs");
%>
<h2> Q. <%= nextQuestion.getQuestion() %></h2>
<%
List<Option> ops = nextQuestion.getOptions();
int opNo =0;
for(Option op: ops){	
%>

<input type="radio" name="op" value="<%= opNo++ %>"/><%= op.getOption() %> <br/>
<%
}
%>
<button type="Submit" >Next Question</button>
</form>
<!--  <a href="QuestionLoaderServlet">Next Question</a> -->
</body>
</html>