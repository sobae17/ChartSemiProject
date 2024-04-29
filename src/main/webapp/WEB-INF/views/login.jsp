<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/header.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/section.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/footer.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/layout.css">
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login page </title>
<script src="https://code.jquery.com/jquery-3.7.1.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>


</head>
<body>
<header class="wrap_header">
	<%@include file="/WEB-INF/views/header.jsp"%>
</header>
<br>
<section class="wrap_section">
<img src="${pageContext.request.contextPath }/resources/imges/chart_title.jpg" alt="login img" width="960" height="460"><br>
<fieldset class="log_frm1">
	<legend> 로그인  </legend>
	<form id="frm-login">
	<div id="aaa" class="login_1"><label>로그인 :   <input type="text" name="id"></label></div><br>
	<div class="pwd_1"><label>비밀번호 : <input type="current-password" name="pwd"></label></div><br>
	<div class="login_btn"><input type="button" value="로그인" class="btn submit" ></div><br>
	<div class="join_btn""><input type="button" value="아이디 찾기" class="btn submit"> <input type="button" value="비밀번호 찾기"> <a href="${pageContext.request.contextPath }/join"><input type="button" value="회원가입하기" ></a></div>
	
	</form>
</fieldset>
</section>
<br>

<footer class="wrap_footer">
			<%@include file="/WEB-INF/views/footer.jsp"%>
		</footer>

<script>
$(loadedHeandler);
function loadedHeandler(){
	$("#frm-login .btn.submit").on("click",frmClickHandler);

}
function frmClickHandler(){
	console.log("frmClickHandler 클릭");
	console.log($("#frm-login").serialize());
	$.ajax({
		url:"${pageContext.request.contextPath }/login"
		, method: "post"
		, data: $("#frm-login").serialize()
		, success : function(result){
			console.log(result);
			if(result == 1){
				alert("로그인 되었습니다.");
				location.href = "${pageContext.request.contextPath }/my/list";
			}else { 
				alert("아이디 또는 패스워드가 일치 하지 않습니다\n 다시 확인하고 로그인 해주세요.");
				$("[name=pwd]").val("");
			}
		}
		,error : function(request, status, error){
			alert("code: "+request.status + "\n" + "message: "
					+ request.responseText +"\n"
					+"error: "+error);
		}
	})
}

</script>	
</body>
</html>