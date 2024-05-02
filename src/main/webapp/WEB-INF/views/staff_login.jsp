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

<style type="text/css">
#frm-stafflogin{
    display: grid;
    justify-content: center;
    align-items: end;
    justify-items: stretch;
    align-content: center;

}
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
	<legend><strong> 의료진 로그인 </strong> </legend>
	
	<form id="frm-stafflogin">
	<div id="staffId" class="login_1"><label>로그인 :   <input type="text" name="staffId"></label></div><br>
	<div class="pwd_1"><label>비밀번호 : <input type="password" name="staffPwd"></label></div><br>
	<div class="staff_btn_login"><input type="button" value="로그인" class="btn submit" ></div><br>
	<div class="staff_btn_id""><input type="button" value="아이디 찾기" class="btn submit"></div><br>
	<div class="staff_btn_pwd"><input type="button" value="비밀번호 찾기"></div>
	
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