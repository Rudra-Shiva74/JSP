<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="com.dao.UserDao"%>
<jsp:useBean id="u" class="com.servlet.User"></jsp:useBean>
<jsp:setProperty property="*" name="u" />

<%
int i = UserDao.save(u);
if (i > 0) {
	response.sendRedirect("adduser-success.jsp");
} else {
	response.sendRedirect("adduser-error.jsp");
}
%>
