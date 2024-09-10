<%@page import="lx.edu_eleventh.vo.AddrbookVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" errorPage="addrbook_error.jsp"
	import="java.util.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/addrbook.css" type="text/css"
	media="screen" />
<script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>

<script type="text/javascript">
	function check(abId) {
		pwd = prompt('수정/삭제 하려면 비밀번호를 넣으세요');
		document.location.href = "editForm.do?abId=" + abId + "&upasswd=" + pwd;
	}
</script>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>주소록:목록화면</title>

</head>

<body>
	<div align="center">
		<H2>주소록:목록화면</H2>
		<form>
			<a href="form.do">주소록 등록</a>
			
			<table border="1">
				<tr>
					<th>번호</th>
					<th>이 름</th>
					<th>이메일</th>
					<th>전화번호</th>
					<th>생 일</th>
					<th>회 사</th>
					<th>메 모</th>
				</tr>
				<c:forEach var="ab" items="${memberlist}">
					<tr>
						<td><a href="editform.do?abId=${ab.abId}">${ab.abId}</a></td>
						<td>${ab.abName}</td>
						<td class="myEmail">${ab.abEmail}</td>
						<td>${ab.abTel}</td>
						<td>${ab.abBirth}</td>
						<td>${ab.abComdept}</td>
						<td>${ab.abMemo}</td>
					</tr>
				</c:forEach>
			</table>

		</form>
		<div>
			<a href="logout.do">logout</a>
		</div>
		<p id="myp">addrbook content</p>
	</div>
	
	<script>
		$(function () {
			$('.myEmail').on('click', function() {
				
				//email클릭했는데 id를 가져와서 전달해야 한다. dom탐색, closest, prev, next
				let abId = $(this).prev('td').prev('td').text();
				$.ajax({
					url: 'addrbook/' + abId,
					success: function(result) {
						$('#myp').html(JSON.stringify(result));
					}
				})	
			});
		});
	</script>
</body>

</html>