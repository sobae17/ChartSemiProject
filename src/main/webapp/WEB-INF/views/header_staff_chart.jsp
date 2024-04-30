<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<header class="header_chart">
<a href="${pageContext.request.contextPath }/staff/list">
<img src="${pageContext.request.contextPath }/resources/imges/chart_login_logo.png" alt="로고사진" width="60"/></a>
<div id="title" ><h1>요일</h1></div>
<div id="title2"><h4>내 가족의 행복과 건강을 위한 요양일지</h4></div>

<c:choose>
	<c:when test="${empty sssloginStaff }">
		<div><button class="btn login">로그인</button></div>
	</c:when>
	<c:otherwise>
		<form id="frm-logout">
		<div><button class="btn logout">로그아웃</button></div>
		</form>
		<div><button class="btn list">일지 목록 보기</button></div>
		<div><button class="btn write">일지 작성하기</button></div>
	</c:otherwise>
</c:choose>

<script>
$(loadedHandler);
function loadedHandler(){
	//event 등록
	$(".btn.login").on("click", btnLoginClickHandler);
	$(".btn.list").on("click", btnListClickHandler);
	$(".btn.write").on("click", btnWriteClickHandler);
	$(".btn.logout").on("click", btnLogoutClickHandler);
}

function btnLoginClickHandler(){
	location.href="${pageContext.request.contextPath}/stafflogin";
}
function btnListClickHandler(){
	location.href="${pageContext.request.contextPath}/staff/list";	
}
function btnWriteClickHandler(){
	location.href="${pageContext.request.contextPath}/staff/write";
}
function btnLogoutClickHandler(){
	alert("로그아웃되었습니다.");
	var frmlogout = document.getElementById("frm-logout");
	frmlogout.action = "${pageContext.request.contextPath}/stafflogout";
	frmlogout.method = "post";
	frmlogout.submit();
}
</script>
</header>