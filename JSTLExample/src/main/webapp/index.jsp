<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTLExample</title>
</head>
<body>

	<h1>JSTL core Tags</h1>

	<!--1.set tag  -->
	<c:set var="j" value="24" scope="application"></c:set>
	<h1>
		<!--2.out tag  -->
		<c:out value="${i}">This is default value</c:out>
	</h1>

	<!--3.remove tag  -->
	<%-- <c:remove var="i"></c:remove> --%>
	<c:out value="${i}">This is default value</c:out>
	<hr>

	<!-- 4.if tag -->
	<c:if test="${i==23 }">
		<h1>
			Yes i is
			<c:out value="${i}"></c:out>
		</h1>
	</c:if>

	<!-- 5.choose tag -->
	<c:choose>
		<c:when test="${i==23}">This is Abhishek Tiwari</c:when>
		<c:when test="${i>23}">This is Rudransh Tiwari</c:when>
		<c:otherwise>This is Aniket</c:otherwise>
	</c:choose>

	<!-- 6. foreach loop -->
	<c:forEach var="j" begin="1" end="${i+1}" step="2">
		<h1>
			The value of j is
			<c:out value="${j }"></c:out>
		</h1>
	</c:forEach>

	<!-- 7.import tag -->

	<c:import var="data" url="index2.jsp"></c:import>
	<c:out value="${data}"></c:out>

	<!-- 8.catch tag -->
	<c:catch var="exception">
		<%
		int a = 12 / 0;
		%>
	</c:catch>
	<br>
	<c:out value="${exception }"></c:out>

	<!-- 9.forToken loop -->
	<c:forTokens var="name" items="Abhishek Rahul Rudransh" delims=" ">
		<c:out value="${name }"></c:out>
	</c:forTokens>

	<!-- 10.redirect page -->
	<%-- 	<c:url var="url" value="http://www.google.com">
		<c:param name="q" value="learn code with Abhishek"></c:param>
	</c:url>

	<c:redirect url="${url}"></c:redirect>--%>

</body>
</html>