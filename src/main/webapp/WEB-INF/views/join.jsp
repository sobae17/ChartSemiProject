<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/layout.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/header.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/section.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/footer.css">
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Chart join page</title>
<script src="https://code.jquery.com/jquery-3.7.1.js"></script>

<style>
.join_frm {
	
}

.patientId {
	display: none;
}

.join_h1 {
	border-bottom-style: none;
	padding-bottom: 10px;
	padding-top: 10px;
}

.join_pwd {
	padding-bottom: 20;
}

.join_id {
	padding-bottom: 20;
}

.join_pwdcheck {
	padding-bottom: 20;
}

.join_emil {
	padding-bottom: 20;
}

.join_pname {
	padding-bottom: 20;
}

.join_pno {
	padding-bottom: 20;
}

.patientId {
	padding-bottom: 20;
	padding-bottom: 10px;
}

.join_section {
	background-color: #ivory;
	border-bottom-left-radius: 10 10 10;
}
}
</style>
</head>
<body>
	<header class="header_Chart">
		<%@include file="/WEB-INF/views/header.jsp"%>
	</header>

	<section class="join_section" style="text-align: center;">
		<div class="join_title" align="center">
			<h1 class="join_h1">회원가입</h1>
		</div>

		<form action="${pageContext.request.contextPath }/join" method="post"
			id="chartjoin" class="join_frm" style="flex-direction: column;">
			<div class="join_frm">
				<div class="join_id">
					아이디 <input type="text" name="id" required>
					<button type="button" class="btn checkid">중복확인</button>
				</div>
				<br>
				<div class="join_pwd">
					비밀번호 <input type="password" name="pwd" required>
				</div>
				<br>
				<div class="join_pwdcheck">
					비밀번호 확인 <input type="password" class="pwdcheck" required>
				</div>
				<br>
				<div class="join_emil">
					이메일 <input type="email" name="email" required>
				</div>
				<br>
				<div class="join_pname">
					입원환자 이름 <input type="text" name="patientName" required>
				</div>
				<br>
				<div class="join_pno">
					입원환자 주민번호 <input type="text" name="patientNo" required>
					<button type="button" class="btn checkpatient">입원확인</button>
				</div>
				<br>
				<div class="patientId">
					입원환자아이디 <input type="text" name="patientId" readonly>
				</div>
				<br>
				<div class="agree-check">
					<input type="checkbox" required> 이용약관 개인정보 수집 및 이용, 마케팅 활용
					선택에 모두 동의합니다.
				</div>
				<br>
			</div>
			<div>
				<button type="submit">회원가입</button>
			</div>
			<div>
				<button type="reset">취소하기</button>
			</div>
		</form>
	</section>

	<footer class="footer_Chart">
		<%@include file="/WEB-INF/views/footer.jsp"%>
	</footer>
	<script>
		$(loadedHendler);
		function loadedHendler() {
			$(".btn.checkid").on("click", btnCheckidClickHandler);
			$(".btn.checkpatient").on("click", btnCheckPatientClickHandler);
			$("#chartjoin .btn.sumbit").on("click", btnJoinClickHandler);
		}
		function errorHandler(request, status, error) {
			alert("code: " + request.status + "/n" + "message: "
					+ request.responseText + "/n" + "error: " + error);
		}

		function btnCheckidClickHandler() {
			var idVal = $("[name=id]").val();
			$.ajax({
				async : false,
				url : "${pageContext.request.contextPath }/checkid.ajax",
				method : "post",
				data : {
					cid : idVal
				}

				,
				success : function(result) {
					console.log(result);
					if (result > 0) {
						alert("중복된 아이디 입니다./n 다른 아이디를 입력해 주세요.")
					} else {
						alert("사용 가능한 아이디 입니다.");
					}
				},
				error : errorHandler

			});
		}
		function btnCheckPatientClickHandler() {
			var patientNo = $("[name=patientNo]").val();
			var patientName = $("[name=patientName]").val();
			$.ajax({
				async : false,
				url : "${pageContext.request.contextPath }/checkpatient.ajax",
				method : "post",
				data : {
					patientNo : patientNo,
					patientName : patientName
				}

				,
				success : function(patientId) {
					console.log(patientId);
					if (patientId == "null") {
						alert("입원환자가 아닙니다. 다시 입력해주세요.")
						$(".patientId").hide();
					} else {
						alert("입원환자 확인 되었습니다.");
						$(".patientId input[name=patientId]").val(patientId);
						$(".patientId").show();
					}
				},
				error : errorHandler
			});

		}

		function btnJoinClickHandler() {
			var idVal = $("[name=id]").val();
			var pwdVal = $("[name=pwd]").val();
			var emailVal = $("[name=email]").val();
			var pidVal = $("[name=patientId]").val();

			console.log("btnJoinClickHandler 클릭");
			$
					.ajax({
						url : "${pageContext.request.contextPath }/join",
						method : "post",
						data : {
							idVal : idVal,
							pwdVal : pwdVal,
							emailVal : emailVal,
							pidVal : pidVal
						}

						,
						success : function(result) {
							console.log(result);
							if (result == 1) {
								alert("회원가입 되었습니다. 로그인 해주세요");
								location.href = "${pageContext.request.contextPath }/login";
							} else {
								alert("회원가입에 실패 했습니다. 다시 시도해 주세요.");
								$("[name=pwd]").val("");
							}
						}
					});

		}
	</script>
</body>
</html>