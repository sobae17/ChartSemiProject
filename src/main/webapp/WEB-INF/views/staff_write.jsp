<%@ include file="/WEB-INF/views/css_link_file.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Write page</title>
<script src="https://code.jquery.com/jquery-3.7.1.js"></script>

</head>
<body>
	<header class="header_Chart">
		<%@include file="/WEB-INF/views/header.jsp"%>
	</header>
	<section>
		<h1>치료사의 일지 작성하기</h1>
		<form id="frm-write">
			<div>
				<label>제목</label><input type="text" name="ptile" required>
			</div>
			<div>
				<label>내용</label>
				<textarea name="pnote" required> 내용쓰기</textarea>
			</div>
			<!-- event click 시 추가됨 -->
			<div>
				<button type="button" class="btn write">글쓰기</button>
			</div>
		</form>

		<footer class="footer_Chart">
			<%@include file="/WEB-INF/views/footer.jsp"%>
		</footer>


		<script>
			$(loadHandler);
			function loadHandler() {
				$(".btn.write").on("click", btnWriteClickHandler);

			}
			function btnWriteClickHandler() {

				//Login 페이지로 이동
				if (checkLogin("로그인되어야 글쓰기가 가능합니다.\n로그인페이지로 이동하시겠습니까?", "write")) {
					return;
				}

				console.log($("[name=pnote]").val().length); // 사용자 입력값은 value가 진짜임.
				console.log($("[name=pnote]").val().trim().length);
				//console.log($("[name=content]").html());
				//console.log($("[name=content]").text());

				if ($("[name=ptile]").val().trim().length == 0) {
					alert("빈문자열만 입력할 수 없습니다. 제목을 작성해주세요.");
					return;
				}
				if ($("[name=pnote]").val().trim().length == 0) {
					alert("빈문자열만 입력할 수 없습니다. 내용을 작성해주세요.");
					return;
				}

				// 중요!
				var frm = document.getElementById("frm-write");
				frm.method = "post"; // content 길이 길거라..
				frm.action = "${pageContext.request.contextPath}/staff_write";
				frm.type = "form-data"; // form 태그 내부에 input type="file"이 있다면
				frm.submit();
			}
		</script>
</body>
</html>
