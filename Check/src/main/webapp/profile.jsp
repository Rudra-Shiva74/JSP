<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ page session="true"%>
<%@ include file="connect.jsp"%>

<c:if test="${email==null}">
	<%
	response.sendRedirect("index");
	%>
</c:if>

<!-- This is start query to fetch user details -->
<sql:query dataSource="${db}" var="rs">
select * from user where Email=? and Password=?;
<sql:param value="${email}"></sql:param>
	<sql:param value="${password}"></sql:param>
</sql:query>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="index.jsp"%>
	<c:forEach var="row" items="${rs.rows}">
		<h1>Hello Mr ${row.Name}</h1>
	</c:forEach>

</body>
</html>
