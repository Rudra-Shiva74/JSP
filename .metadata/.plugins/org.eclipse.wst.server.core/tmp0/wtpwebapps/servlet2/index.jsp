<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="test2" method="post">
		<input type="number" placeholder="Enter Your First Number" name="num1" />
		<input type="number" placeholder="Enter Your Second Number"
			name="num2" /> <input type="submit" value="Add" name="action" /><input
			type="submit" value="Substract" name="action" />
	</form>
</body>
</html>