<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="com.dao.UserDao"%>
<jsp:useBean id="u" class="com.servlet.User"></jsp:useBean>
<jsp:setProperty property="*" name="u" />
<%
UserDao.delete(u);
response.sendRedirect("viewusers.jsp");
%>
