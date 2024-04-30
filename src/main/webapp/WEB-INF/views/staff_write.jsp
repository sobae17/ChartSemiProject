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
			<div> <label>날짜</label> <input type="datetime-local" name="aaa"  /></div>
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
//시리얼 넘버 뭐시낑이로 묶어 보내기
			}
			function btnWriteClickHandler() {
			var ptitleVal = ${"[name=ptitle]"}.val();
			var patientNameVal = ${"[name=pnote]"}.val();
			
			console.log("btnWriteClickHandler 클릭클릭");
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
					
				}
				
			}
			
			
			
			})
			}
			
			
			
				
				
				
				
				
				
		</script>
</body>
</html>
