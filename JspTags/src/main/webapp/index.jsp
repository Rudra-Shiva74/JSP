<%@page import="java.util.Random,java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>First Jsp Page</title>
<style>
h1 {
	color: red;
}
</style>
</head>
<body>
	<%@ include file="header.jsp"%>
	<h1>Hello World!</h1>
	<%!int a = 50;
	int c = 40;

	public int sum(int a, int b) {
		return a + b;
	}

	String str = "Abhishek Tiwari";

	public String reverse() {
		StringBuffer br = new StringBuffer(str);
		return br.reverse().toString();
	}%>

	<%
	int a = 90;
	out.println(a);
	out.println(c);
	out.print(sum(34, 67));
	out.print(reverse());
	Random r = new Random();
	int n = r.nextInt(10) + 1;
	%>

	<h1>
		The sum is :
		<%=sum(34, 56)%></h1>
	<%=a%>
	<h1>
		Random number is
		<%=n%></h1>
</body>
</html>