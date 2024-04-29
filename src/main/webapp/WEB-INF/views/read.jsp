<%@ include file="/WEB-INF/views/css_link_file.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Read Chart</title>
</head>
<body>
	<header class="header_Chart">
		<%@include file="/WEB-INF/views/header_chart.jsp"%>
	</header>
	<section class="wrap_section">
		<h1>치료일지</h1>
			<div class="flex">
		<div class="chart grid">
				<div>${dto. }</div>
				<div>${ }</div>
				<div>${ }</div>
				<div>${ }</div>
</div>
<div class="title">${dto. }</div>	
<div>${}</div>
<c:if test="${}"></c:if>	


</c:if>
<!-- 댓글  -->
<form id="frm_replay">
<input type="hidden" name="chart" value="${}">
<div class="flex">
<div>댓글</div>

<div><input type="text" name="chartReplyContent" required></
</div>
<div><button type="button" class="btn replay">댓글 달기</button></div>

</div>
</form>

			</div>
		<footer class="footer_Chart">
			<%@include file="/WEB-INF/views/footer.jsp"%>
		</footer>
</body>
</html>