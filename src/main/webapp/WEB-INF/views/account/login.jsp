<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%
	String path = request.getContextPath();
	int vv2 = request.getServerPort();
	int a=1;
%>
<title>Insert title here</title>

</head>
<body>

	<c:set var="dd" value="a"></c:set>
	<c:out value="${dd }"/>
	<c:out value="&lt要显示的内容%" escapeXml="true"></c:out>
	<c:set var="salary" scope="session" value="${200*2 }"></c:set>
	<c:out value="${salary }"></c:out>
	<c:remove var="salary"></c:remove>
	<c:out value="${salary }"></c:out>
	<c:if test="${salary!=400 }">
		salary=400;
	</c:if>
</body>
</html>