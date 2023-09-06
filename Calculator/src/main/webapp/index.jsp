
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calculator | Home Page</title>
</head>
<body>
	<%
	String opr = request.getParameter("select");
	int num1 = Integer.parseInt(request.getParameter("number1"));
	int num2 = Integer.parseInt(request.getParameter("number2"));
	if (opr.equals("+")) {
	%>
	<h1>
		Addition is :
		<%=(num1 + num2)%></h1>
	<%
	} else if (opr.equals("-")) {
	%><h1>
		Substraction is :
		<%=(num1 - num2)%></h1>
	<%
	} else if (opr.equals("*")) {
	%><h1>
		Multiplier is :
		<%=(num1 * num2)%></h1>
	<%
	} else if (opr.equals("/")) {
	%>
	<h1>
		Division is :
		<%=(num1 / num2)%></h1>
	<%
	} else if (opr.equals("%")) {
	%>
	<h1>
		Modulas is :
		<%=(num1 % num2)%></h1>
	<%
	}
	%>
	<%@ include file="index.html"%>


</body>
</html>