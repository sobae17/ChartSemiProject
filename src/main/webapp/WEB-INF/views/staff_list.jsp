<%@ include file="/WEB-INF/views/css_link_file.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/read.css">
<title>chart List page</title>
<script src="https://code.jquery.com/jquery-3.7.1.js"></script>
<style>
/* /* .chart_readlist_section {
	display: felx; */
} */
.list_flex {
	display: flex;
	flex-direction: row;
	justify-content: space-around;
	flex-wrap: wrap;
}
.wrap{
float:right;
}
.btn_sch{
float: left;
padding-left: 10px;
}
</style>

</head>
<body>
	<header class="header_Chart">
		<%@include file="/WEB-INF/views/header_staff_chart.jsp"%>
	</header>
	[[${pvolist }]]
	<section calss="chart_readlist_section">
		<h1 style="text-align: center;">치료일지</h1>
		<div class="notice-area">
			<article class="list-area">
				<!-- 검색 시작 -->
				<fieldset id="chart_sch" >
					<legend> 검색 </legend>
					<form name="csearch" method="get">
						<div class="search_area">
							<div class="wrap" style="border-left-width: 100;">
								<input type="search" class="chart_sch" size="15" maxlength="20"
									placeholder="검색어 필수">
								<div class="bun_wrap">
									<button type="submit" class="btn_sch">검색</button>
								</div>
							</div>
						</div>

						<div class="total_area">
							
							<select name="patientId"> 
							<c:forEach items="${pvolist }" var="vo">
								<option value="${vo.patientId }">
								${vo.patientName }(${vo.patientId }) 
								</option>
							</c:forEach>
							</select>
						</div>
						<!-- 환자 이름 가지고 와서 넣기 -->

					</form>
				</fieldset>
				
				<!-- 게시판 목록   -->
				<form class="frm_list">
					<fieldset class="list_fieled">
						<table class="list_flex">

						</table>

					</fieldset>

				</form>
<!--게시판 목록 끝  -->
			</article>

		</div>
	</section>
	<div><a herf="${pageContext.request.contextPath}/staff/write?"></a> <input type="button" value="글 작성하기" class="btn write"></div>

	<footer class="footer_Chart">
		<%@include file="/WEB-INF/views/footer.jsp"%>
	</footer>
	
	
<script>
$(function(){
	$("[name=patientName]").on("change", selectChangeHandler)
});
function selectChangeHandler(){
	console.log("select change!!!");
	console.log($("[name=patientName]").val());
	
	$.ajax({
		url : "${pageContext.request.contextPath }/staff/list",
		method : "post",
		data : {patientId :$("[name=patientName]").val()},
		dataType: "json",
		success : function(result) {
			console.log(result);
			if(result == -1){
				alert("retry...... dfksdljfl");
				return;
			} 
			//display
			var htmlVal = `
			<tr>
				<td class="c_num" style="width:100px;"> chart id</a></td>
				<td class="c_date" style="width: 200px;">staffName</td>
				<td class="c_subject" style="width: 500px;">제목</td>
				<td class="c_writer"style="width: 200px;">patientName</td>
			</tr>
			`;
			for(var i in result){
				var dto = result[i];
				htmlVal += `
				<tr>
					<td>\${dto.chartId }</td>
					<td>\${dto.staffName }</td>
					<td><a href="${pageContext.request.contextPath}/staff/read?id=\${dto.chartId }">\${dto.ptitle }</a></td>
					<td>\${dto.patientName }</td>
				</tr>
				`;
			}
			$(".list_flex").html(htmlVal);
			
		},
		error : function(request, status, error) {
			alert("code: " + request.status + "\n"
					+ "message: " + request.responseText + "\n"
					+ "error: " + error);
		}
	});
	
}

</script>
</body>
</html>