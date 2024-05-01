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
<style type="text/css">
.btn_write_staff{
	display: flex;
	justify-content: space-around;
	flex-wrap: nowrap;
	align-items: flex-end;
	flex-direction: column;
}
.btn_write_W{
padding-top: 20px;
padding-right: 10px;

}
.btn_rest_W{
padding: 10px;

}
.s_wrtie_title{
border-bottom-style: ridge;
padding-bottom: 10px;
}
</style>
</head>
<body>
	<header class="header_Chart">
		<%@include file="/WEB-INF/views/header_staff_chart.jsp"%>
	</header>
	<section>
		<h1 class="s_wrtie_title">치료사의 일지 작성하기</h1>
		<form id="frm-write">
			<div>
				<label>제목</label><input type="text" name="ptitle">
			</div>

			<div>
				<label>환자 ${pagemap.dtolist[0].patientName }</label> <select
					name="patientId">
					<c:forEach items="${pvolist }" var="vo">
						<option value="${vo.patientId }">${vo.patientName }(${vo.patientId })
						</option>
					</c:forEach>
				</select>
			</div>
			<div>
				<label>날짜</label> <input type="datetime-local" name="pnoteDate" />
			</div>
			<div>
				<label>내용</label>
				<textarea name="pnote" cols="130" rows="35" required> 내용쓰기</textarea>
			</div>
			<!-- event click 시 추가됨 -->
			<div class="btn_write_staff">
				<div class="btn_write_W">
					<button type="button" class="btn write"
						style="width: 80px; height: 30px;">글쓰기</button>
				</div>
				<div class="btn_rest_W">
					<button type="reset" class="btn reset"
						style="width: 80px; height: 30px;">취소하기</button>
				</div>
			</div>
		</form>
	</section>
	<footer class="footer_Chart">
		<%@include file="/WEB-INF/views/footer.jsp"%>
	</footer>


	<script>
$(loadedHandler);
function loadedHandler(){
	//event 등록
	$(".btn.write").on("click", btnWriteClickHandler);
}
function btnWriteClickHandler(){
	//Login 페이지로 이동
	
	if($("[name=ptitle]").val().trim().length == 0){
	   alert("빈문자열만 입력할 수 없습니다. 제목을 작성해주세요.");
	   return;
    }
	if($("[name=pnote]").val().trim().length == 0){
	   alert("빈문자열만 입력할 수 없습니다. 내용을 작성해주세요.");
	   return;
	}
	
	// 중요!
	var frm = document.getElementById("frm-write");
	frm.method="post";  // content 길이 길거라..
	frm.action = "${pageContext.request.contextPath}/staff/write";
	frm.enctype="multipart/form-data";  // form 태그 내부에 input type="file"이 있다면
	frm.submit();
}
	</script>
</body>
</html>



