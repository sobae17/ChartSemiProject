<%@ include file="/WEB-INF/views/css_link_file.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MyPage</title>
<script src="https://code.jquery.com/jquery-3.7.1.js"></script>
<style type="text/css">
.mypage_grid {
	background-color: seashell;
	display: grid;
	grid-template-columns: 1fr 1fr;
	padding: 20px;
}

.mypage_info {
	border-bottom-style: double;
	padding: 10px;
}
</style>


</head>
<body>

	<header class="wrap_header">
		<%@include file="/WEB-INF/views/header_chart.jsp"%>
	</header>
	<section>
		<h1 class="mypage_info">나의 정보</h1>
		<div class="mypage_grid">
			<div>환자 보호자 우선 순위</div>
			<div>1 순위</div>
			<div>내 이름</div>
			<div>홍길동</div>
			<div>전화 번호</div>
			<div>010-0000-000</div>
			<div>주소</div>
			<div>서울시 성북구 도동</div>
		</div>

	</section>


	<footer class="wrap_footer">
		<%@include file="/WEB-INF/views/footer.jsp"%>
	</footer>
</body>
</html>