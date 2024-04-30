<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<header class="header_chart">
<a href="${pageContext.request.contextPath }/staff/list">
<img src="${pageContext.request.contextPath }/resources/imges/chart_login_logo.png" alt="로고사진" width="60"/></a>
<div id="title" ><h1>요일</h1></div>
<div id="title2"><h4>내 가족의 행복과 건강을 위한 요양일지</h4></div>
<a href="${pageContext.request.contextPath }/stafflogin"><input type="button" value="로그아웃" class="btn submit"></a>
<a href="${pageContext.request.contextPath }/staff/list"><input type="button" value="일지 목록 보기" class="btn submit"></a>
<a href="${pageContext.request.contextPath }/staff/write"><input type="button" value="일지 작성하기" class="btn submit"></a>
</header>