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
<h1>���� �α��� ��������  </h1>

<section>
<fieldset>
	<legend> �α��� </legend>
	<form id="frm-login">
	<div><label>���̵�<input type="text" name="id"></label></div>
	<div><label>��й�ȣ<input type="current-password" name="pwd"></label></div>
	<div><input type="button" value="�α���" class="btn submit"></div>
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
