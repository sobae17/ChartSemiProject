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
		<%@include file="/WEB-INF/views/header_staff_chart.jsp"%>
	</header>
	<section>
		<h1>치료사의 일지 작성하기</h1>
		<form id="frm-write">
			<div>
				<label>제목</label><input type="text" name="ptitle">
			</div>
			
			<div> <label>환자 이름 불러와서 넣기 ${pagemap.dtolist[0].patientName }</label>
			<select name="patientId"> 
			<c:forEach items="${pvolist }" var="vo">
				<option value="${vo.patientId }">
				${vo.patientName }(${vo.patientId }) 
				</option>
			</c:forEach>
			</select>
			</div>
			<div> <label>날짜</label> <input type="datetime-local" name="pnoteDate"  /></div>
			<div>
				<label>내용</label>
				<textarea name="pnote" cols="130" rows="35" required> 내용쓰기</textarea>
			</div>
			<!-- event click 시 추가됨 -->
			<div>
				<button type="button" class="btn write" style="width: 80px; height: 30px;">글쓰기</button>
			</div>
			<div>
				<button type="reset" class="btn reset" style="width: 80px; height: 30px;">취소하기</button>
			</div>
		</form>
</section>
		<footer class="footer_Chart">
			<%@include file="/WEB-INF/views/footer.jsp"%>
		</footer>


<script>
$(loadHandler);
function loadHandler() {
$(".btn.write").on("click", btnWriteClickHandler);
}
$("[name=ptitle]").val();
$("[name=pnote]").val();
function btnWriteClickHandler() {
		
	if(checkLogin("로그인되어야 글쓰기가 가능합니다.\n로그인페이지로 이동하시겠습니까?","write")){
		return;
	}
	console.log($("[name=ptitle]").val().length);  // 사용자 입력값은 value가 진짜임.
	console.log($("[name=pnote]")}.val().trim().length);
	
		if($("[name=ptitle]").val().trim().length == 0){
		   alert("빈문자열만 입력할 수 없습니다. 제목을 작성해주세요.");
		   return;
	    }
		if($("[name=pnote]").val().trim().length == 0){
			   alert("빈문자열만 입력할 수 없습니다. 내용을 작성해주세요.");
			   return;
			   
			   
		}
		
		var frm = document.getElementById("frm-write");
		frm.method="post";  // content 길이 길거라..
		frm.action = "${pageContext.request.contextPath}/staff/write";
		frm.enctype="multipart/form-data";  // form 태그 내부에 input type="file"이 있다면
		frm.submit();	
	}
		
			/* console.log("btnWriteClickHandler 클릭클릭");
			$.ajax({
					url:"${pageContext.request.contextPath }/staff/list"
					,method: "post"
					,data : {
						ptitleVal : ptitleVal,
						patientNameVal : patientNameVal
						
					}
			success : function(result) {
				console.log(result);
				if(result == 1) {
					alert("글이 등록 되었습니다.");
					location,.href = "${pageContext.request.contextPath }staff/list";
				} else {
					alert("글 등록에 실패 했습니다. 다시 시도해 주세요.");
					var ptitleVal = ${"[name=ptitle]"}.val("");
					var patientNameVal = ${"[name=pnote]"}.val("");
				}
				{
					
				} */
		
				
		</script>
</body>
</html>
