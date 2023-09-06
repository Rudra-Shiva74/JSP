<%@ page import="java.io.*,java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL Example</title>
</head>
<body>
	<h1>JSTL Function Tag</h1>
	<c:set var="String" value="Hello Abhishek      Tiwari       "></c:set>
	<!-- 1 -->
	<c:if test="${fn:contains(String,'Abhishek')}">
		<p>Abhishek Found in the string</p>
	</c:if>

	<!-- 2 -->
	<c:if test="${fn:containsIgnoreCase(String,'ABHISHEK')}">
		<p>This is containsIgnoreCase</p>
	</c:if>

	<!-- 3 -->
	<c:if test="${fn:endsWith(String,'Tiwari') }">
		<p>This is endsWith</p>
		<p>${fn:contains(String,'Abhi') }</p>
	</c:if>

	<!-- 4 -->
	<c:set var="strin1" value="Hello <xyz>Abhishek Tiwari</xyz>"></c:set>
	<p>string1 :- ${fn:escapeXml(strin1)}</p>
	<p>string :- ${strin1}</p>

	<!-- 5 -->
	<p>This is indexOf:-${fn:indexOf(String,'Abhishek') }</p>

	<!-- 6 -->
	<p>This is with trim function : - ${fn:length(fn:trim(String))}</p>
	<p>This is without trim function : - ${fn:length(String)}</p>

	<!-- 7 -->
	<p>This is startsWith : - ${fn:startsWith(String,'Hello') }</p>
	<p>This is endsWith : - ${fn:endsWith(String,'Tiwari')}</p>

	<!-- 8 -->
	<c:set var="String1" value="Welcome-to-my-home"></c:set>
	<c:set var="String2" value="${fn:split(String1,'-')}"></c:set>
	<c:set var="String3" value="${fn:join(String2,' ') }"></c:set>
	<p>${String3}</p>
	<c:set var="String4" value="${fn:split(String3,' ')}"></c:set>
	<c:set var="String5" value="${fn:join(String4,'-') }"></c:set>
	<p>${String5}</p>

	<!-- 9 -->
	<p>The toLowerCase is : - ${fn:toLowerCase(String5)}</p>
	<p>The toUpperCase is : - ${fn:toUpperCase(String5)}</p>

	<!-- 10 -->
	<p>This is substring : - ${fn:substring(String5,8,18)}</p>

	<!-- 11 -->
	<p>This is substringAfter : - ${fn:substringAfter(String5,'my') }</p>
	<p>This is substringBefore : - ${fn:substringBefore(String5,'my') }</p>
	<p>This is length of String : - ${fn:length(String5) }</p>
	<p>This is replace : - ${fn:replace(String5,'Welcome','NoWelcome') }</p>
	<hr>


	<h1>JSTL sql tag</h1>
	<sql:setDataSource var="db" driver="com.mysql.cj.jdbc.Driver"
		url="jdbc:mysql://localhost:3306/youtube" user="root"
		password="ShivaRudra@7488" />
	<sql:query dataSource="${db}" var="rs">
		select * from users;
		</sql:query>
	<table border="2" width="100%">
		<tr>
			<th>fullName</th>
			<th>Email</th>
			<th>userName</th>
			<th>password</th>
		</tr>

		<c:forEach var="table" items="${rs.rows}">
			<tr>
				<td>${table.fullName}</td>
				<td>${table.Email}</td>
				<td>${table.userName}</td>
				<td>${table.password}</td>
			</tr>
		</c:forEach>
	</table>
	<p>${rs }</p>

	<%-- 	<sql:update dataSource="${db}" var="rs">
		insert into users values("Abhishek","Tiwari","Rampur","wale");
		</sql:update>
	<p>${rs }</p>

	<sql:update dataSource="${db}" var="rs">
	delete from users where password=? and fullName=?;
	<sql:param value="wale"></sql:param>
		<sql:param value="Abhishek"></sql:param>
	</sql:update>

	<sql:update dataSource="${db}" var="rs">
	update users set fullName="Rudransh" where password="123456";
	</sql:update>--%>
	<hr>

	<h1>Jstl Formating Tag</h1>

	<c:set var="number" value="1234.543"></c:set>
	<fmt:parseNumber var="j" type="number" value="${number}"></fmt:parseNumber>
	<fmt:parseNumber var="a" type="number" integerOnly="true"
		value="${number }"></fmt:parseNumber>
	<p>First is : - ${j } and second is ${a }</p>

	<%=new Date().toString()%>

	<c:set var="number" value="123456.78987"></c:set>
	<p>
		Formating number 1 : -
		<fmt:formatNumber type="currency" value="${number}"></fmt:formatNumber>
	</p>
	<p>
		Formating number 2 : -
		<fmt:formatNumber type="number" groupingUsed="true" value="${number}"></fmt:formatNumber>
	</p>
	<p>
		Formating number 3 : -
		<fmt:formatNumber type="number" maxIntegerDigits="3" value="${number}"></fmt:formatNumber>
	</p>
	<p>
		Formating number 4 : -
		<fmt:formatNumber type="number" maxFractionDigits="4"
			value="${number }"></fmt:formatNumber>
	</p>
	<p>
		Formating number 5 : -
		<fmt:formatNumber type="percent" value="${number}"></fmt:formatNumber>
	</p>
	<p>
		Formating number 6 : -
		<fmt:formatNumber type="number" pattern=".###$" value="${number}"></fmt:formatNumber>
	</p>
	<c:set var="date" value="12-9-2023"></c:set>
	<p>
		<fmt:parseDate value="${date}" pattern="dd-mm-yyyy"></fmt:parseDate>
	</p>
</body>
</html>