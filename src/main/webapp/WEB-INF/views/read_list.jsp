<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/header.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/section.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/footer.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/layout.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/read.css">

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>chart read page</title>
<script src="https://code.jquery.com/jquery-3.7.1.js"></script>
<!-- <link rel="stylesheet" href="../css/footer.css"> -->

</head>
<body>
<header class="header_Chart">
	<%@include file="/WEB-INF/views/header_chart.jsp"%>
</header>
<section calss="chart_readlist_section">

<h1> 치료일지</h1>

<table class="chart_read">
<tr class="c_list">
<td class="chart_num">글 번호</td>
<td class="chart_"> 날짜 </td>
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

</table>
</section>

<footer class="footer_Chart">
			<%@include file="/WEB-INF/views/footer.jsp"%>
		</footer>
</body>
</html>