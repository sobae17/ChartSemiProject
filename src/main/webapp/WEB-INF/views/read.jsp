<%@ include file="/WEB-INF/views/css_link_file.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Read Chart</title>
<script src="https://code.jquery.com/jquery-3.7.1.js"></script>
<style type="text/css">
.chart_grid {
	display: grid;
	align-content: space-around;
	align-items: stretch;
	justify-content: space-around;
	grid-template-columns: 1fr 1fr;
	background-color: seashell;
	}

.read_pnote_title {
	display: flex;
	justify-content: center;
	border-bottom-style: double;
	padding-bottom: 10px;
}

#frm_replay {
	padding-top: 30px;
	border-top-style: double;
}
.c_read_pnote{
padding-top: 30px;
padding-bottom: 30px;;
}
.read_reply{
display: grid;
grid-template-columns: 1fr 1fr 1fr;
}
</style>
</head>
<body>
	<header class="header_Chart">
		<%@include file="/WEB-INF/views/header_chart.jsp"%>
	</header>
	<section class="wrap_section">
		<h1 class="read_pnote_title">치료일지</h1>
		<div class="flex">

			<div class="chart_grid">
				<div>날짜</div>
				<div>${dto.chartdate }</div>
				<div>환자</div>
				<div>${dto.patientName }</div>
				<div>치료사</div>
				<div>${dto.staffName }</div>
			</div>
			<div class="c_read_pnote">
				<div>${dto.ptitle }</div>
				<div>${dto.pnote }</div>
			</div>

			<!-- 댓글  -->
			<form id="frm_replay">
				<input type="hidden" name="chartId" value="${dto.chartId}">
				<div class="read_reply">
					<div>댓글</div>

					<div>
						<input type="text" name="chartReplyContent" required>
					</div>
					<div>
						<button type="button" class="btn replay">댓글 달기</button>
					</div>

				</div>
			</form>

		</div>
	</section>
	<footer class="footer_Chart">
		<%@include file="/WEB-INF/views/footer.jsp"%>
	</footer>
</body>
<script type="text/javascript">
$(loadedHandler);
function loadedHandler(){
	$(".btn.replay").on("click", btnReplyClickHandler);
	//getRelyData();
}
function getRelyDat(){
	
	$.ajax({
		url: "${pageContext.request.contextPath }/my/reply/read.ajax"
		,method:"post"
		,error : ajaxErrorHandler
		,data: {chartId:"${dto.chartId }"}
		,dataType:"json"
		,success: function(result){
			console.log(result);
			displayReplyWrap(result);
		}
	});
}
function btnReplyClickHandler(){
	if($("#frm-reply [name=chartReplyContent]").val().trim().length == 0){
		alert("입력된 글이 없습니다. 입력 후 글 등록해주세요.");
		return;
	}
	console.log($("#frm-reply").serialize());
	$.ajax({
		url: "${pageContext.request.contextPath }/my/reply/write.ajax"
		,method:"post"
		,error : ajaxErrorHandler
		,data: $("#frm-reply").serialize()
		,dataType:"json"
		,success: function(result){
			console.log(result);
			if(result == "-1"){
				alert("댓글 작성이 되지 않았습니다. 게시글 목록으로 이동 후 다시 작성해주세요.");
				location.href="${pageContext.request.contextPath }/my/list";
				return;
			}
			if(result == "0"){
				alert("댓글 등록에 실패했습니다. 다시 시도해주세요.");
				return;
			}
			displayReplyWrap(result);
		}
	});
}	
	
function ajaxErrorHandler (request, status, error){
	alert("code: "+request.status + "\n" + "message: " 
			+ request.responseText + "\n"
			+ "error: "+error);
}
	
</script>
</html>