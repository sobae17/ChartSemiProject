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
<form class="health_frm">

			<h1>건강 일지</h1>
			<div class="health_chart">
				<div class="pulse">
					<p>맥박</p>
				</div>
				<div class="weight">
					<p>몸무게</p>
				</div>
				<div class="blood_pressure">
					<p>혈압</p>
				</div>
				<div class="pee">
					<p>소변</p>
					<p>2</p>
				</div>
				<div class="comment">
					<p>코멘트
					<p>
				</div>
			</div>
		</form>
</section>
</table>
<footer class="footer_Chart">
			<%@include file="/WEB-INF/views/footer.jsp"%>
		</footer>
</body>
</html>