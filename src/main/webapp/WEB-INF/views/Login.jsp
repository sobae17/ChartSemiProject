<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>login page </title>
<script src="https://code.jquery.com/jquery-3.7.1.js"></script>
</head>
<body>
<h1>요일 로그인 웹페이지  </h1>

<section>
<fieldset>
	<legend> 로그인 </legend>
	<form id="frm-login">
	<div><label>아이디<input type="text" name="id"></label></div>
	<div><label>비밀번호<input type="current-password" name="pwd"></label></div>
	<div><input type="button" value="로그인" class="btn submit"></div>
	</form>
</fieldset>

<script>
$(loadedHeandler);
function loadedHeandler(){
	$("#frm-login .btn.submit").on("click",frmClickHandler);
}

</script>	
</body>
</html>
