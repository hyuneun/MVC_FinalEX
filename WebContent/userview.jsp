<%@page import="net.mvc.model.UserManaget"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:forEach var="c" items="${user}">
${c.sawon_name } 관리고객<br>
<table>
	<tr><th>고객번호</th><th>고객명</th><th>고객전화</th></tr>
			<c:set var="aa" value="0" />
		<c:forEach var="b" items="${user2 }">
			<c:if test="${b.gogek_damsano == c.sawon_no }">
			<tr><td>${b.gogek_no }</td><td>${b.gogek_name }</td><td>${b.gogek_tel }</td><tr>
			<c:set var="aa" value="${aa+1 }"/>
			</c:if>
		</c:forEach>
</table>
인원수 : <c:out value="${aa}" />
<br><br>
</c:forEach>
</body>
</html>