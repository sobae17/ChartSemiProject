<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/footer.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/layout.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/header.css">
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>join</title>
<script src="https://code.jquery.com/jquery-3.7.1.js"></script>
<style type="text/css">
frm{
display: inline-block;
}
frm-id{
padding: 10px;
}
</style>
<style type="text/css">
.header_Chart{
width: 1400px;
height: 150px;
background-color: #EEC6C6;
}
.header_Chart div { 
  display:inline-block;
}
</style>
<style type="text/css">
.footer_Chart{
background-color: #EEC6C6;
width: 1400px;
height: 150px;
}
</style>
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
<div>아이디 </div>
<div><input type="text" name="id"></div>
<div><input type="button" onclick="alert('제이에스를 써야합니다')" value="중복확인"></div>
</form>
<form class="frm-pwd">
<div> 비밀번호</div>
<div> <input type="passward" name="pwd"></div>
</form>
<form class="frm-pwd2">
<div> 비밀번호 확인</div>
<div><input type="current-password" name="pwd1"></div>
</form>
<form class="frm-email">
<div> 이메일 </div>
<div><input type="email" name="emaill"></div>
</form>
<form class="frm-pname">
<div> 입원환자 이름 </div>
<div><input type="text" name="pname"></div>
</form>
<form class="frm-pno">
<div> 입원환자 주민번호 </div>
<div><input type="text" name="pno"></div>
</form>
<form class="frm_join_button">
<div class="reset_btn"><input type="reset" name="join_reset" value="취소하기"></div>
<div class="join_btn"><input type="submit" name="join_sumbit" value="회원가입 하기"></div>
</form>

</section>
		
		
<footer class="footer_Chart">
			<%@include file="/WEB-INF/views/footer.jsp"%>
		</footer>
</body>
</html>