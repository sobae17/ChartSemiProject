<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/header.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/section.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/footer.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/layout.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/read.css">

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>chart read page</title>
<script src="https://code.jquery.com/jquery-3.7.1.js"></script>
<!-- <link rel="stylesheet" href="../css/footer.css"> -->
<style>
.chart_readlist_section {
	display: felx;
}

.list_flex {
	display: flex;
	flex-direction: row;
	justify-content: space-around;
	flex-wrap: wrap;
}
</style>

</head>
<body>
	<header class="header_Chart">
		<%@include file="/WEB-INF/views/header_chart.jsp"%>
	</header>
	<section calss="chart_readlist_section">

		<h1 style="text-align: center;">치료일지</h1>
		<div class="notice-area">
			<article class="list-area">
				<!-- 검색 시작 -->
				<fieldset id="chart_sch">
					<legend> 검색 </legend>
					<form name="csearch" method="get">
						<div class="search_area">
							<div class="wrap">
								<input type="search" class="chart_sch" size="15" maxlength="20"
									placeholder="검색어 필수">
								<div class="bun_wrap">
									<button type="submit" class="btn_sch">검색</button>
								</div>
							</div>
						</div>

						<div class="total_area">
							<p class="total_txt">
								<span>홍길동</span>님
							</p>
						</div>
						<!-- 환자 이름 가지고 와서 넣기 -->

					</form>
				</fieldset>
				
				<!-- 게시판 목록   -->
				<form class="frm_list">
					<fieldset class="list_fieled">
						<table class="list_flex">
							<tr>
								<td>글 번호</td>
								<td>날짜</td>
								<td>제목</td>
								<td>작성자</td>
							</tr>
							<tr>
								<td>1</td>
							</tr>
							<tr>
								<td>2024-02-25</td>
							</tr>
							<tr>
								<td>연하치료</td>
							</tr>
							<tr>
								<td>작성자</td>
							</tr>

						</table>

					</fieldset>

				</form>
<!--게시판 목록 끝  -->
			</article>

		</div>
	</section>

	<footer class="footer_Chart">
		<%@include file="/WEB-INF/views/footer.jsp"%>
	</footer>
</body>
</html>