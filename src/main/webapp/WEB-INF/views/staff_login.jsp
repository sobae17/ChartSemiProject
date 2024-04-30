<%@ include file="/WEB-INF/views/css_link_file.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Staff login page </title>
<script src="https://code.jquery.com/jquery-3.7.1.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
<style type="text/css">
.staff_logo {
display: flex;
flex-direction: row;
flex-wrap: wrap;
align-content: center;
justify-content: center;
align-items: baseline;

}


</style>

</head>

<body>
<header class="wrap_header">
	<%@include file="/WEB-INF/views/header.jsp"%>
</header>
<br>
<section class="wrap_section">
<div class="staff_logo">
<img src="${pageContext.request.contextPath }/resources/imges/staff_login.png" alt="login img" width="500" height="300" class="staff_logo"><br>
</div>
<fieldset class="log_frm1">
	<legend> 의료진 로그인  </legend>
	<form id="frm-stafflogin">
	<div id="aaa" class="login_1"><label>로그인 :   <input type="text" name="staffId"></label></div><br>
	<div class="pwd_1"><label>비밀번호 : <input type="password" name="staffPwd"></label></div><br>
	<div class="login_btn"><input type="button" value="로그인" class="btn submit" ></div><br>
	<div class="join_btn""><input type="button" value="아이디 찾기" class="btn submit"> <input type="button" value="비밀번호 찾기"> <a href="${pageContext.request.contextPath }/join"><input type="button" value="의료진 회원가입하기" ></a></div>
	
	</form>
</fieldset>
</section>
<br>

<footer class="wrap_footer">
			<%@include file="/WEB-INF/views/footer.jsp"%>
		</footer>

	<script>
		$(loadedHeandler);
		function loadedHeandler() {
			$("#frm-stafflogin .btn.submit").on("click", frmClickHandler);

		}
		function frmClickHandler() {
			console.log("frmClickHandler 클릭");
			console.log($("#frm-stafflogin").serialize());
			$
					.ajax({
						url : "${pageContext.request.contextPath }/stafflogin",
						method : "post",
						data : $("#frm-stafflogin").serialize(),
						success : function(result) {
							console.log(result);
							if (result == 1) {
								alert("로그인 되었습니다.");
								location.href = "${pageContext.request.contextPath }/staff/list";
							} else {
								alert("아이디 또는 패스워드가 일치 하지 않습니다\n 다시 확인하고 로그인 해주세요.");
								$("[name=staffPwdpwd]").val("");
							}
						},
						error : function(request, status, error) {
							alert("code: " + request.status + "\n"
									+ "message: " + request.responseText + "\n"
									+ "error: " + error);
						}
					})
		}
	</script>	
</body>
</html>