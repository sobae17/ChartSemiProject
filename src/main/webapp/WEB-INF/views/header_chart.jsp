<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<header class="header_chart">
<a href="${pageContext.request.contextPath }/read_list">
<img src="${pageContext.request.contextPath }/resources/imges/chart_login_logo.png" alt="로고사진" width="60"/></a>
<div id="title" ><h1>요일</h1></div>
<div id="title2"><h4>내 가족의 행복과 건강을 위한 요양일지</h4></div>
<a href="${pageContext.request.contextPath }/login"><input type="button" value="로그아웃" class="btn submit"></a>
<input type="button" value="내 정보">
<a href="${pageContext.request.contextPath }/read_list"><input type="button" value="치료일지" class="btn submit"></a>
<a href="${pageContext.request.contextPath }/health_chart"><input type="button" value="건강일지" class="btn submit"></a>

</header>