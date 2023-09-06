<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ include file="connect.jsp"%>

<%
String name = request.getParameter("name");
String email = request.getParameter("email");
String pass = request.getParameter("password");
String submit = request.getParameter("submit");
%>

<c:if test="${param.submit ne null}">

	<c:catch var="exception">
		<sql:update dataSource="${db}">
		insert into user values("<%=name%>","<%=pass%>","<%=email%>");
		</sql:update>
		<%
		response.sendRedirect("login");
		%>
	</c:catch>
	<c:if test="${exception!=null}">
		<p>user exist</p>
	</c:if>
</c:if>



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SignUp</title>
</head>
<body>

	<%@ include file="index.jsp"%>
	<form action="" method="post">
		<input type="text" placeholder="Enter your name" name="name" required />
		<input type="email" placeholder="Enter your email" name="email"
			required /> <input type="password" placeholder="Enter your password"
			name="password" required /><input type="submit" name="submit" />
	</form>
</body>
</html>




