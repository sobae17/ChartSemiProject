<%@ include file="/WEB-INF/views/css_link_file.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Read Chart</title>
<style type="text/css">
.chart_grid {
	display: grid;
	align-content: space-around;
	align-items: stretch;
	justify-content: space-around;
	background-color: seashell;
}

.read_pnote_title {
	display: flex;
	justify-content: center;
	border-bottom-style: double;
	padding-bottom: 10px;
}

#frm_replay {
	padding-top: 30px;
	border-top-style: double;
}
.c_read_pnote{

display: grid;
background: #ivory;
}
</style>
</head>
<body>
	<header class="header_Chart">
		<%@include file="/WEB-INF/views/header_chart.jsp"%>
	</header>
	<section class="wrap_section">
		<h1 class="read_pnote_title">치료일지</h1>
		<div class="flex">

			<div class="chart_grid">
				<div>날짜</div>
				<div>${dto.chartdate }</div>
				<div>환자</div>
				<div>${dto.patientName }</div>
				<div>치료사</div>
				<div>${dto.staffName }</div>
			</div>
			<div class="c_read_pnote">
				<div>${dto.ptitle }</div>
				<div>${dto.pnote }</div>
			</div>

			<!-- 댓글  -->
			<form id="frm_replay">
				<input type="hidden" name="chartId" value="${dto.chartId}">
				<div class="flex">
					<div>댓글</div>

					<div>
						<input type="text" name="chartReplyContent" required></
					</div>
					<div>
						<button type="button" class="btn replay">댓글 달기</button>
					</div>

				</div>
			</form>

		</div>
	</section>
	<footer class="footer_Chart">
		<%@include file="/WEB-INF/views/footer.jsp"%>
	</footer>
</body>
</html>