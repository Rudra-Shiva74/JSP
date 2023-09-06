<%@page import="com.mvc.LoginBean"%>
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
	LoginBean loginBean = (LoginBean) request.getAttribute("bean");
	%>
	<h1>
		Hello, Your name is
		<%=loginBean.getName()%>
	</h1>
</body>
</html>