<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
session = request.getSession(false);
String name = (String) session.getAttribute("name");
if (name == null) {
	response.sendRedirect("index.jsp");
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Profile</title>
</head>
<body>
	<%@ include file="index.jsp"%>
	<h3>
		Your Name is
		<%=name%></h3>
	<br>
	<h3>You are 5th semester B.Tech (cse) student</h3>
	<br>
	<h3>Your Registration number is 210101120022</h3>
</body>
</html>