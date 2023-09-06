<%@page import="java.util.List"%>
<%@page import="com.tech.blog.entity.SharePost"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Details</title>
</head>
<body>
	<%@ include file="header.jsp"%>
	<%
	if (user == null) {
		response.sendRedirect("login.jsp");
	} else {
		String userid = (String) session.getAttribute("userid");
		List<SharePost> list2 = userDao.getPostByUser(userid);
		for (SharePost p : list2) {
	%>
	<%=p.getPostid()%>
	<%
	}
	}
	%>
</body>
</html>