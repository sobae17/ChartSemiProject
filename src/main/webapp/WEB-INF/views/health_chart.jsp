<%@ include file="/WEB-INF/views/css_link_file.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Health Chart Page</title>
<script src="https://code.jquery.com/jquery-3.7.1.js"></script>
<style type="text/css">
section {
	padding-top: 8%;
	padding-bottom: 8%;
}

.health_frm {
	background-color: ivory;
}

.health_chart>div {
	display: flex;
	flex-direction: column;
	flex-wrap: wrap;
	align-content: space-around;
	justify-content: space-around;
	align-items: stretch;
}

h1 {
	text-align: center;
}

p {
	text-align: center;
}
</style>
</head>
<body>
	<header class="header_Chart">
		<%@include file="/WEB-INF/views/header_chart.jsp"%>
	</header>
	<section>
		<form class="health_frm">

			${pagemap.dtolist[0].patientName }<h1>건강 일지</h1>

			<div class="health_chart">
				<div class="pulse">
					<p>맥박</p>
					<input type="text" name="pulse" readonly>
				</div>
				<div class="weight">
					<p>몸무게</p>
					<input type="text" name="weight" readonly>
				</div>
				<div class="blood_pressure">
					<p>혈압</p>
					<input type="text" name="blood_pressure" readonly>
				</div>
				<div class="pee">
					<p>소변</p>
					<input type="text" name="pee" readonly>
				</div>
				<div class="comment">
					<p>코멘트</p>
					<input type="text" name="comment" readonly>
				</div>
				<br>
			</div>
		</form>
	</section>
	</table>
	<footer class="footer_Chart">
		<%@include file="/WEB-INF/views/footer.jsp"%>
	</footer>
</body>
</html>