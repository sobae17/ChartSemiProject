<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/layout.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/footer.css">
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
<section>
<h1> 건강 일지</h1>
<table class="chart_health">
<tr class="health_list">
<td class="health_num">글 번호</td>
<td class="health_"> 날짜 </td>
<td> 치료일지 </td>
<td> 작성자 </td>
</tr>
<tr>
<td> 01</td>
<td> 01</td>
<td> 01</td>
<td> 01</td>
</tr>
<tr>
<td> 01</td>
<td> 01</td>
<td> 01</td>
<td> 01</td>
</tr>
<tr>
<td> 01</td>
<td> 01</td>
<td> 01</td>
<td> 01</td>
</tr>
<tr>
<td> 01</td>
<td> 01</td>
<td> 01</td>
<td> 01</td>
</tr>
</section>
</table>
<footer class="footer_Chart">
			<%@include file="/WEB-INF/views/footer.jsp"%>
		</footer>
</body>
</html>