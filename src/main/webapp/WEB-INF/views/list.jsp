<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/header.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/section.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/footer.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/layout.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/read.css">

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>chart read page</title>
<script src="https://code.jquery.com/jquery-3.7.1.js"></script>
<!-- <link rel="stylesheet" href="../css/footer.css"> -->

</head>
<body>
<header class="header_Chart">
	<%@include file="/WEB-INF/views/header_chart.jsp"%>
</header>
<section calss="chart_readlist_section">

<h1> 치료일지</h1>
<div class="notice-area">
<article class="list-area">
<!-- 검색 시작 -->
<fieldset id="chart_sch">
<legend> 검색 </legend>
<form name="csearch" method="get">
<div class="search_area">
<div class="wrap">
<input type="search" class="chart_sch" size="15" maxlength="20" placeholder="검색어 필수">
<div class="bun_wrap"> <button type="submit" class="btn_sch">검색</button>
</div>
</div>
</div>

<div class="total_area">
<p class="total_txt"><span>홍길동</span>"님"</p></div>
<!-- 환자 이름 가지고 와서 넣기 -->

</form>
</fieldset>
<!-- 게시판 검색 끝 -->

<form class="pnote_list">
<div class="pnote_main">
<div class="tb_wrap">
<div class="tb">
<table>
<colgroup>
<col style="width:110px;">
<col>
<col style="width:100px;">
<col style="width:100px;">
<col style="width:80px;">
</colgroup>
<thead>
<tr>
<th>
<p class="txt_title">번호</p>
</th>
<th>
<p class="txt_title">날짜</p>
</th>
<th>
<p class="txt_title">제목</p>
</th>
<th>
<p class="txt_title">작성자</p>
</th>
<th>
<p class="txt_title">조회</p>
</th>
</tr>
</thead>
<!-- 게시물 리스트 채워 넣기  -->
<tbody>
<tr>
<td>dd</td>
<td>dd</td>
<td>dd</td>
<td>dd</td>
<td>dd</td>
</tr>
<tr>
<td>dd</td>
<td>dd</td>
<td>dd</td>
<td>dd</td>
<td>dd</td>
</tr>
<tr>
<td>dd</td>
<td>dd</td>
<td>dd</td>
<td>dd</td>
<td>dd</td>
</tr>
<tr>
<td>dd</td>
<td>dd</td>
<td>dd</td>
<td>dd</td>
<td>dd</td>
</tr>
<tr>
<td>dd</td>
<td>dd</td>
<td>dd</td>
<td>dd</td>
<td>dd</td>
</tr>


</tbody>

</table>
</div>
</div>


</div>

</form>
<!-- 하단에 페이지 이동 칸 만들기.. -->
<nav class="pg_wrap">
<span class="pg">
<span class="sound_only">열린</span>
<strong class="pg_current">1</strong>
<span class="sound_only">페이지</span>
<a href="#" class="pg_page">
"2"
<span class="sound_only">페이지</span>
</a>
<a href="#" class="pg_page">
"3"
<span class="sound_only">페이지</span>
</a>
<a href="#" class="pg_page">
"4"
<span class="sound_only">페이지</span>
</a>
<a href="#" class="pg_page">
"5"
<span class="sound_only">페이지</span>
</a>
<a href="#" class="pg_page pg_end">
<i class="fa">
::before
</i>
<i class="fa">
::before
</i>
</a>

</span>
</nav>
</article>
<!-- 게시판 목록 끝 -->
</div>
</section>

<footer class="footer_Chart">
			<%@include file="/WEB-INF/views/footer.jsp"%>
		</footer>
</body>
</html>