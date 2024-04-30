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
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
	crossorigin="anonymous"></script>


</head>
<body>

	<header class="wrap_header">
		<%@include file="/WEB-INF/views/header_chart.jsp"%>
	</header>
	<section>
		<h1>나의 정보</h1>
		<div class="mypage">
			<div>환자 아이디</div>
			<div>내 이름</div>
			<div>전화 번호</div>
			<div>주소</div>
		</div>

	</section>


	<footer class="wrap_footer">
		<%@include file="/WEB-INF/views/footer.jsp"%>
	</footer>
</body>
</html>