<%@ include file="/WEB-INF/views/css_link_file.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/read.css">
<title>chart List page</title>
<script src="https://code.jquery.com/jquery-3.7.1.js"></script>
<style>
/* /* .chart_readlist_section {
	display: felx; */
} */
.list_flex {
	display: flex;
	flex-direction: row;
	justify-content: space-around;
	flex-wrap: wrap;
}
.wrap{
float:right;
}
.btn_sch{
float: left;
padding-left: 10px;
}
</style>

</head>
<body>
	<header class="header_Chart">
		<%@include file="/WEB-INF/views/header_chart.jsp"%>
	</header>
	[[${map }]]<br>[[${map.totalPageCount }]]<br>[[${map.startPageNum }]]<br>[[${map.endPageNum }]]<br>[[${map.currentPageNum }]]
	<section calss="chart_readlist_section">
		<h1 style="text-align: center;">치료일지</h1>
		<div class="notice-area">
			<article class="list-area">
				<!-- 검색 시작 -->
				<fieldset id="chart_sch" >
					<legend> 검색 </legend>
					<form name="csearch" method="get">
						<div class="search_area">
							<div class="wrap" style="border-left-width: 100;">
								<input type="search" class="chart_sch" size="15" maxlength="20"
									placeholder="검색어 필수">
								<div class="bun_wrap">
									<button type="submit" class="btn_sch">검색</button>
								</div>
							</div>
						</div>

						<div class="total_area">
							
							<select name="patientName"> 
							<option>
							${pagemap.volist[0].patientName } 
							</option>
							</select>
							
						</div>
						<!-- 환자 이름 가지고 와서 넣기 -->

					</form>
				</fieldset>
				
				<!-- 게시판 목록   -->
				<form class="frm_list">
					<fieldset class="list_fieled">
						<table class="list_flex">
							<tr>
								<td class="c_num" style="width:100px;"> 글 번호</a></td>
								<td class="c_date" style="width: 200px;">날짜</td>
								<td class="c_subject" style="width: 500px;">제목</td>
								<td class="c_writer"style="width: 200px;">작성자</td>
							</tr>
<c:forEach items="${pagemap.volist }" var="vo">
							<tr>
								<td>${vo.rn }</td>
								<td>${vo.chartdate }</td>
								<td><a href="${pageContext.request.contextPath}/my/read?id=${dto.chartId }">${dto.ptitle }</a></td>
								<td>${vo.staffName }</td>
							</tr>
</c:forEach>
						</table>

					</fieldset>

				</form>
<!--게시판 목록 끝  -->
			</article>

		</div>
	</section>
	<div><a herf="${pageContext.request.contextPath}/staff/write?"></a> <input type="button" value="글 작성하기" class="btn write"></div>

	<footer class="footer_Chart">
		<%@include file="/WEB-INF/views/footer.jsp"%>
	</footer>
</body>
</html>