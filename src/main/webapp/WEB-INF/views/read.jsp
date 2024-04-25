<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/footer.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/layout.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/header.css">
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Read 글 내용 보기</title>
</head>
<body>
	<header class="header_Chart">
		<%@include file="/WEB-INF/views/header_chart.jsp"%>
	</header>
	<section class="wrap_section">

		<h1>치료일지</h1>
		<form class="read_main">
			<fieldset>
				<article>
					<table>
						<thead>
							<tr>글 번호: 01
							</tr>

						</thead>

						<tbody>


						</tbody>


					</table>


				</article>

			</fieldset>

			<textarea rows="100" cols="100" style="width: 957px; height: 450px;"> 
예시> * Dysphagia - Apply 30min (PM 16:45 ~ 17:15)
- 자세 취하기를 통한 안전한 인두 삼킴 유도를 위한 턱 당김 자세(Chin tuck) 유지하기
- 반사의 정상화를 위한 차가운 설압자(ice stick)를 이용한 온도촉각자극하기(TTS)
- pharyngeal alignment 위한  Massage
			</textarea>
		</form>

<!-- 댓글  -->
<form class="chart_replay">
<fieldset>
<input type="text" name="chart_re" style="width: 900px; height: 100px;">
<input type="submit" name="repaly_submit" value="댓글 달기">

</fieldset>
</form>

		<!-- 잠시  -->



		<footer class="footer_Chart">
			<%@include file="/WEB-INF/views/footer.jsp"%>
		</footer>
</body>
</html>