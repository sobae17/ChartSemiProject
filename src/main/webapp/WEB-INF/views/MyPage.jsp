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
.mypage{
background-color: #ivory;
display: inline-block;

}

</style>


</head>
<body>

	<header class="wrap_header">
		<%@include file="/WEB-INF/views/header_chart.jsp"%>
	</header>
	<section>
		<h1>나의 정보</h1>
		<div class="mypage">
			<div> 환자 보호자 우선 순위</div>
			<div>${cvolist.patientId }</div>
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