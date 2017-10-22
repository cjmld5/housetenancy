<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	home/index
	<c:set var="a" value="1234"></c:set>
	<c:choose>
		<c:when test="${a==1234 }">
			<c:out value="${a }"></c:out>
		</c:when>
		<c:otherwise>
			<c:out value="${a*2 }"></c:out>
		</c:otherwise>
	</c:choose>
	<c:import url="http://www.runoob.com" var="data"></c:import>
	<c:out value="${data }"></c:out>
</body>
</html>