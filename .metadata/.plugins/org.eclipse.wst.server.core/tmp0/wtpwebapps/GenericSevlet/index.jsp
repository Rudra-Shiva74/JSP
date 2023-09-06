<%@page import="com.helper.DBConector"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String str = request.getContextPath();
	%>
	<%=str%>
	<%
	Connection conn = DBConector.createConnection();
	%>
	<%=conn%>
</body>
</html>