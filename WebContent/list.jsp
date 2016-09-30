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

사용자 목록보기<br>
<table border="1">
	<tr><th>부서번호</th><th>부서명</th></tr>
	<c:forEach var="c" items="${list }">
	<tr>
		<td>${c.buser_no }</td>
		<td><a href="userview.do?userid=${c.buser_no }&command=view">${c.buser_name }</a></td>
	</tr>
	</c:forEach>
</table>
</body>
</html>