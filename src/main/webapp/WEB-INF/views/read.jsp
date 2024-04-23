<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/footer.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/layout.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/header.css">
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Read 글 내용 보기</title>
</head>
<body>
	<header class="header_Chart">
		<%@include file="/WEB-INF/views/header_chart.jsp"%>
	</header>
	<section class="wrap_section">

		<h1>치료일지</h1>
		<div>
			<input type="search" value="검색창">
		</div>
		<div class="chart grid">
			<div class="" flex>
				<div>${vo.chartId }</div>
				<div>${vo.patientId }</div>
				<div>${vo.writer }</div>
				<div>${vo.pnote }</div>

			</div>
		</div>
		<div></div>


		<footer class="footer_Chart">
			<%@include file="/WEB-INF/views/footer.jsp"%>
		</footer>
</body>
</html>