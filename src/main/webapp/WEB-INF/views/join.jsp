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
<title>Chart join page</title>
<script src="https://code.jquery.com/jquery-3.7.1.js"></script>

</head>
<body>
<header class="header_Chart">
	<%@include file="/WEB-INF/views/header.jsp"%>
</header>
</head>
<body>

<section style="text-align:center;">
<div class="">
<h1> 회원가입 </h1>
</div>

<form action="${pageContext.request.contextPath }/join" method="post" id="chartjoin" style="flex-direction: column;">
<div class="join_frm">
<div>아이디 <input type="text" name="id" required> <button type="button" class="btn checkid">중복확인</button></div><br>
<div>비밀번호 <input type="password" name="pwd" required></div><br>
<div>비밀번호 확인 <input type="password" required> </div><br>
<div>이메일 <input type="email" name="email" required></div><br>
<div> 입원환자 이름 <input type="text" name="pname" required></div> <br>
<div> 입원환자 주민번호 <input type="text" name="pno" required> <button type="button" class="btn checkpatient"> 입원확인</button></div><br>
<div class="agree-check"><input type="checkbox" required> 이용약관 개인정보 수집 및 이용, 마케팅 활용 선택에 모두 동의합니다.</div><br>
</div>
<div><button type="submit">회원가입</button></div>
<div><button type="reset"> 취소하기</button></div>
</form>
</section>
		
<footer class="footer_Chart">
			<%@include file="/WEB-INF/views/footer.jsp"%>
		</footer>
<script>
$(loadedHendler);
function loadedHendler() {
	$(".btn.checkid").on("click", btnCheckidClickHandler);
}
function btnCheckidClickHandler() {
	var idVal = $("[name=id]").val();
	$.ajax({
		async : false
		,url : "${pageContext.request.contextPath }/checkid.ajax"
		,method : "post"
		,data : { cid : $("[name=id]").val()}
		
		,success : function(result) {
			console.log(result);
			if(result > 0){
				alert("중복된 아이디 입니다./n 다른 아이디를 입력해 주세요.")
			}else{
				alert("사용 가능한 아이디 입니다.");
			}
			,error : function(request, status, error){
				alert("code: "+request.status+"/n"+ "message: "
						+ request.responseText + "/n"
						+ "error: "+error);
			}
			
	});
$(loadedHendler);
function loadedHendler() {
	$(".btn.checkpatient").on("click", btnCheckPatientClickHandler);
}
function btnCheckPatientClickHandler() {
	 var pnoval = $("[name=pno]").val();
	 $,ajax({
		async : false
		,url : "${pageContext.request.contextPath }/checkpatient.ajax"
		,method : "post"
		,data : { cpno : = $("[name=pno]").val()}
		
		,success : function(result) {
			console.log(result);
			if(result > 0){
				alert("입원환자가 아닙니다. 다시 입력해주세요.")
			}else{
				alert("입원환자 확인 되었습니다.");
			}
			,error : function(request, status, error){
				alert("code: "+request.status+"/n"+ "message: "
						+ request.responseText + "/n"
						+ "error: "+error);
			}
	 });
	 

	
	


</script>
</body>
</html>