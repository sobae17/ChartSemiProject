<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/footer.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/layout.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/header.css">

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Write page</title>
</head>
<body>
<header class="header_Chart">
	<%@include file="/WEB-INF/views/header.jsp"%>
</header>
<section>
<h1> 치료사의 일지 작성하기</h1>
<form>
<div> 
<textarea rows="30" cols="100">내용</textarea>
</div>
</form>
<div class="btn_submit"><input type="reset" value="삭제하기"> <input type="submit" value="수정하기"> <input type="submit" value="작성하기">
</div>
</section>
<footer class="footer_Chart">
			<%@include file="/WEB-INF/views/footer.jsp"%>
		</footer>
</body>
</html>