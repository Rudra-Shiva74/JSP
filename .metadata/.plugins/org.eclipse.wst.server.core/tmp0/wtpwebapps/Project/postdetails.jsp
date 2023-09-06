<%@page import="com.tech.blog.entity.SharePost"%>
<%@page import="java.util.List"%>
<%@page import="com.tech.blog.dao.UserDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page errorPage="errorpage.jsp"%>


<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta charset="UTF-8">
<title>Post</title>
</head>
<body>
	<%@ include file="header.jsp"%>
	<c:catch var="exeption">
		<%
		int cid = Integer.parseInt(request.getParameter("postid"));

		List<SharePost> list2 = userDao.getpostbyid(cid);
		for (SharePost sp : list2) {
		%>
		<div class="container-fluid d-flex justify-content-center bg p-5">
			<div class="card background" style="width: 35rem;">
				<img src="post/<%=sp.getImage()%>"
					class="card-img-top img-thumbnail" alt="..." style="height: 20rem;">
				<div class="card-body">
					<div class="d-flex justify-content-between">
						<p class="text-primary">
							<%=sp.getUsername()%><span class="text-dark"> has poted</span>
						</p>
						<p><%=sp.getRegisterdate()%></p>
					</div>
					<div>
						<b>Content</b>
						<p class="card-text"><%=sp.getContent()%></p>
					</div>
					<div class="mt-3">
						<b>Program</b>
						<p class="card-text"><%=sp.getProgram()%></p>
					</div>
					<%
					if (user != null) {
					%>
					<!-- <div class="d-flex justify-content-center mt-2">
						<button class="btn border border-dark me-2">
							<i class="fa-regular fa-thumbs-up fa-shake"></i>
						</button>
						<button class="btn border border-dark me-2">
							<i class="fa-regular fa-comment fa-bounce"></i>
						</button>
						<button class="btn border border-dark me-2">
							<i class="fa-regular fa-thumbs-down fa-shake"></i>
						</button>
					</div> -->
					<%
					}
					%>
				</div>
			</div>
		</div>

		<%
		}
		%>
	</c:catch>
	<c:if test="${exeption!=null }">
		<%
		response.sendRedirect("./");
		%>
	</c:if>
</body>
</html>