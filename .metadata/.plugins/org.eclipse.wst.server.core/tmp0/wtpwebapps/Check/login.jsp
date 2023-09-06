
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<%@ include file="connect.jsp"%>
<c:if test="${email!=null}">
	<%
	response.sendRedirect("index");
	%>
</c:if>
<c:if test="${email==null}">
	<%
	String email = request.getParameter("email");
	String password = request.getParameter("password");
	String submit = request.getParameter("submit");
	%>
	<c:if test="${param.submit ne null}">

		<sql:query dataSource="${db}" var="rs">
	select * from user where Email=? and Password =?;
	<sql:param value="<%=email%>"></sql:param>
			<sql:param value="<%=password%>"></sql:param>
		</sql:query>
		<p>${rs.rows}</p>
		<c:forEach var="row" items="${rs.rows}">
			<c:set var="email" value="${row.Email}" scope="session"></c:set>
			<c:set var="password" value="${row.Password}" scope="session"></c:set>
			<%
			response.sendRedirect("profile");
			%>
		</c:forEach>
	</c:if>

	<!DOCTYPE html>
	<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<%@ include file="index.jsp"%>
	<form action="" method="post">
		<input type="email" placeholder="Enter your email" name="email" /> <input
			type="password" placeholder="Enter your password" name="password" /><input
			type="submit" value="submit" name="submit" />
	</form>
</body>
	</html>
</c:if>
