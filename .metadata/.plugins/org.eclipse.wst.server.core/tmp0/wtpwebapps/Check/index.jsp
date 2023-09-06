<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
	<%-- <a href="index">Home</a>
	<c:if test="${email==null}">
		<a href="login">Login</a>
		<a href="signup">Signup</a>
	</c:if>
	<a href="profile">Profile</a>
	<a href="logout">logout</a> --%>

	<%
	int j = 1;
	for (int i = 1; i < 6; i++) {
		j = j * i;
	}
	%>
	<%=j%>
</body>
</html>