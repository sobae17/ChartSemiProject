<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/footer.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/layout.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/header.css">

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Health Chart Page</title>
</head>
<body>
<header class="header_Chart">
	<%@include file="/WEB-INF/views/header_chart.jsp"%>
</header>
<h1> 건강 일지</h1>

<footer class="footer_Chart">
			<%@include file="/WEB-INF/views/footer.jsp"%>
		</footer>
</body>
</html>