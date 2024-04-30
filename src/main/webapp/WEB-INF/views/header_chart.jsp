<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<header class="header_chart">
<img src="${pageContext.request.contextPath }/resources/imges/chart_login_logo.png" alt="로고사진" width="60"/>
<div id="title" ><h1>요일</h1></div>
<div id="title2"><h4>내 가족의 행복과 건강을 위한 요양일지</h4></div>
<c:choose>
	<c:when test="${empty ssslogin }">
		<div><button class="btn login">로그인</button></div>
	</c:when>
	<c:otherwise>
		<form id="frm-logout">
		<div><button class="btn logout">로그아웃</button></div>
		</form>
		<div><button class="btn mypage">내 정보</button></div>
		<div><button class="btn list">치료일지</button></div>
		<div><button class="btn health"">건강일지</button></div>
	</c:otherwise>
</c:choose>
<script>
$(loadedHandler);
function loadedHandler(){
	//event 등록
	$(".btn.login").on("click", btnLoginClickHandler);
	$(".btn.mypage").on("click", btnMypageClickHandler);
	$(".btn.list").on("click", btnListClickHandler);
	$(".btn.health").on("click", btnHealthClickHandler);
	$(".btn.logout").on("click", btnLogoutClickHandler);
}

function btnLoginClickHandler(){
	location.href="${pageContext.request.contextPath}/login";
}
function btnMypageClickHandler(){
	location.href="${pageContext.request.contextPath}/my/mypage";	
}
function btnListClickHandler(){
	location.href="${pageContext.request.contextPath}/my/list";
}
function btnHealthClickHandler(){
	location.href="${pageContext.request.contextPath}/my/health";
}
function btnLogoutClickHandler(){
	alert("로그아웃되었습니다.");
	var frmlogout = document.getElementById("frm-logout");
	frmlogout.action = "${pageContext.request.contextPath}/logout";
	frmlogout.method = "post";
	frmlogout.submit();
}
</script>
</header>