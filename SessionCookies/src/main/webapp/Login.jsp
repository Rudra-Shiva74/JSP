<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<%@ include file="index.jsp"%>
	<form action="Request" method="post">
		<input type="text" placeholder="Enter your name" name="name" /> <input
			type="password" placeholder="Enter your password" name="password" />
		<input type="submit" value="submit" />
	</form>
</body>
</html>