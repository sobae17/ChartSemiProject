<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>chart read page</title>
<script src="https://code.jquery.com/jquery-3.7.1.js"></script>
<!-- <link rel="stylesheet" href="../css/footer.css"> -->
<style type="text/css">
talbe, tr, td{
  border:1px solid black;
  text-align: center;
}
chart_read_section{
align-content: center;
}
</style>
<style type="text/css">
.header_Chart{
width: 1400px;
height: 150px;
background-color: #EEC6C6;
}
.header_Chart div { 
  display:inline-block;
}
</style>
<style type="text/css">
.footer_Chart{
background-color: #EEC6C6;
width: 1400px;
height: 150px;
}
</style>
</head>
<body>
<header class="header_Chart">
	<%@include file="/WEB-INF/views/header.jsp"%>
</header>
<section calss="chart_read_section">

<h1> 치료일지</h1>

<table class="chart_read">
<tr class="c_list">
<td>글 번호</td>
<td> 날짜 </td>
<td> 치료일지 </td>
<td> 작성자 </td>
</tr>
<tr>
<td> 01</td>
<td> 01</td>
<td> 01</td>
<td> 01</td>
</tr>
<tr>
<td> 01</td>
<td> 01</td>
<td> 01</td>
<td> 01</td>
</tr>
<tr>
<td> 01</td>
<td> 01</td>
<td> 01</td>
<td> 01</td>
</tr>
<tr>
<td> 01</td>
<td> 01</td>
<td> 01</td>
<td> 01</td>
</tr>

</table>
</section>

<footer class="footer_Chart">
			<%@include file="/WEB-INF/views/footer.jsp"%>
		</footer>
</body>
</html>