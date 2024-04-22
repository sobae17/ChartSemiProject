<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/layout.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/header.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/section.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/footer.css">
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>join</title>
<script src="https://code.jquery.com/jquery-3.7.1.js"></script>

</head>
<body>
<header class="header_Chart">
	<%@include file="/WEB-INF/views/header.jsp"%>
</header>
</head>
<body>

<section style="text-align:center;">
<h1>회원가입</h1>
<form class="frm-id">
<div>아이디 </div> <div><input type="text" name="id" />
<input type="button" onclick="alert('제이에스를 써야합니다')" value="중복확인" /></div>
</form>
<form class="frm-pwd">
<div> 비밀번호 </div> <div>
<input type="passward" name="pwd" /></div>
</form>
<form class="frm-pwd2">
<div> 비밀번호 확인 </div><div><input type="current-password" name="pwd1" /></div>
</form>
<form class="frm-email">
<div> 이메일 
</div><div><input type="email" name="emaill" /></div>
</form>
<form class="frm-pname">
<div> 입원환자 이름 </div>
<div><input type="text" name="pname" /></div>
</form>
<form class="frm-pno">
<div> 입원환자 주민번호 </div><div><input type="text" name="pno"> <input type="button" onclick="alert('제이에스를 써야합니다')" value="중복확인" /></div>
</form>
<div class="agree-check"><input type="checkbox" /> 이용약관 개인정보 수집 및 이용, 마케팅 활용 선택에 모두 동의합니다.</div>
<form class="frm_join_button">
<div class="join_btn"><input type="reset" name="join_reset" value="취소하기"> <input type="submit" name="join_sumbit" value="가입하기"></div>
</form>

</section>
		
<footer class="footer_Chart">
			<%@include file="/WEB-INF/views/footer.jsp"%>
		</footer>
</body>
</html>