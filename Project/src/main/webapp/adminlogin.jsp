<%@page import="com.tech.blog.entity.Massage"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page errorPage="errorpage.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Login</title>

</head>
<body>
	<%@ include file="header.jsp"%>
	
	<section class="bg-color second pt-md-5 pt-lg-5 pt-5 pb-5 mt-auto">
		<div
			class="container mt-lg-5 mt-md-5 pt-5 pb-5 d-flex justify-content-center">
			<div class="card" style="width: 22rem;">
				<div
					class="border border-light d-flex justify-content-center pb-3 pt-3 background"
					style="font-size: 100px;">
					<i class="fa-solid fa-user-shield" style="color: black;"></i>

				</div>
				<%
				Massage msg = (Massage) session.getAttribute("error");
				if (msg != null) {
				%>
				<div class="alert <%=msg.getCss()%> alert-dismissible fade show"
					role="alert">
					<strong><%=msg.getContant()%></strong>
					<%=msg.getType()%>
					<button type="button" class="btn-close" data-bs-dismiss="alert"
						aria-label="Close"></button>
				</div>
				<%
				session.removeAttribute("error");
				}
				%>
				<form action="AdminLogin" method="post">
					<div class="m-3">
						<input type="email" class="form-control" id="inputPassword"
							name="email" placeholder="Enter Your Admin Email" required
							autocomplete="off">
					</div>
					<div class="m-3">
						<input type="password" class="form-control" id="inputPassword"
							name="password" placeholder="Enter Your Admin password"
							autocomplete="off" required>
					</div>
					<div class="m-3">
						<div class="d-flex justify-content-center">
							<button type="submit" class="btn btn-outline-dark">Submit</button>
						</div>
					</div>
				</form>
			</div>
		</div>
	</section>
</body>
</html>