<%@ include file="/WEB-INF/views/css_link_file.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Health Chart Page</title>
<script src="https://code.jquery.com/jquery-3.7.1.js"></script>
<style type="text/css">
section {
	padding-top: 8%;
	padding-bottom: 8%;
}

.health_frm {
	background-color: ivory;
}

.health_chart>div {
	display: flex;
	flex-direction: column;
	flex-wrap: wrap;
	align-content: space-around;
	justify-content: space-around;
	align-items: stretch;
}

h1 {
	text-align: center;
}

p {
	text-align: center;
}
</style>
</head>
<body>
	<header class="header_Chart">
		<%@include file="/WEB-INF/views/header_chart.jsp"%>
	</header>
	<section>
		<form class="health_frm">
			<h1>${vo.patientName } 님의건강 일지</h1>
			<div>
				날짜: <span id="chartdate">${vo.chartdate }</span>
			</div>
				<input type="date" name="healthDate" id="healthDate">
				<br>
			<div class="health_chart">
				<div class="pulse">
					<p>맥박</p>
					<input type="text" name="pulse" value="${vo.pulse }"
						style="text-align: center;" readonly>
				</div>
				<div class="weight">
					<p>몸무게</p>
					<input type="text" name="weight" value="${vo.weight }"
						style="text-align: center;" readonly>
				</div>
				<div class="blood_pressure">
					<p>혈압</p>
					<input type="text" name="bloodPressure"
						value="${vo.bloodPressure }" style="text-align: center;" readonly>
				</div>
				<div class="pee">
					<p>소변</p>
					<input type="text" name="pee" value="${vo.pee }"
						style="text-align: center;" readonly>
				</div>
				<div class="memo">
					<p>코멘트</p>
					<input type="text" name="memo" value="${vo.memo }"
						style="text-align: center;" readonly>
				</div>
				<br>
				<div class="staffName">
					<p>작성자</p> <input type="text" name="staffName" value="${vo.staffName }"
						style="text-align: center;"readonly>
				</div>
			</div>
		</form>
		
	</section>
	</table>
	<footer class="footer_Chart">
		<%@include file="/WEB-INF/views/footer.jsp"%>
	</footer>
	<script>
		// 오늘 날짜 이후 선택 안되게 하는 코드
		var now_utc = Date.now()
		// 한국 9시간 오차처리
		var timeOff = new Date().getTimezoneOffset() * 60000;
		var today = new Date(now_utc - timeOff).toISOString().split("T")[0];
		$("[name=healthDate]").prop("max", today);
	</script>
	<script>
		$(loadedHandler);
		function loadedHandler() {
			$("[name=healthDate]").on("change", healthDateChangeHandler)

		}
		function healthDateChangeHandler() {
			console.log("선택된 날짜 :");
			console.log($("[name=healthDate]").val());
			$.ajax({
				url : "${pageContext.request.contextPath}/my/health",
				type : "post",
				data : {
					healthDate : $("[name=healthDate]").val()
				},
				dataType : "json",
				success : function(result) {
					console.log(result);
					if (result == null) {
						alert("일지가 없습니다.");
					} else {
						$("#chartdate").html(result.chartdate);
						$("[name=pulse]").val(result.pulse);
						$("[name=weight]").val(result.weight);
						$("[name=bloodPressure]").val(result.bloodPressure);
						$("[name=pee]").val(result.pee);
						$("[name=memo]").val(result.memo);
						//$("[name=staffName]").val(result.staffName);
					}
				},
				error : errorHandler
			});
		}
		function errorHandler(request, status, error) {
			alert("code: " + request.status + "/n" + "message: "
					+ request.responseText + "/n" + "error: " + error);
		}
	</script>
</body>
</html>